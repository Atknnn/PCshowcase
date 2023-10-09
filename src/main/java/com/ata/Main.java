package com.ata;

import com.ata.controller.ComputerController;
import com.ata.controller.LikeController;
import com.ata.controller.PostController;
import com.ata.controller.UserController;
import com.ata.repository.entity.Computer;
import com.ata.repository.entity.ComputersSpec;
import com.ata.repository.entity.Post;
import com.ata.utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // HOCAM KURGUYU DEĞİŞTİRMEK ZORUNDA KALDIGIM İÇİN MAİN İ BASTAN YAZMAK ZORUNDA KALDIM YETİŞMEDİ ... :.(

    // AMA RUNLAYIP DENEYEBİLRİSİNİZ CALISIYOR :)




menu ();

    }
    private static void gorselMenu() {

        System.out.println("******************************");
        System.out.println("****SHOWCASE'e HOs GELDİNİZ****");
        System.out.println("******************************");
        System.out.println();
        System.out.println("1- Kayıt Ol");
        System.out.println("2- Giriş Yap");
        System.out.println("0- Kapat");

    }
    private static void menu() {
        boolean cikis = false;

        do {
            gorselMenu();
            System.out.println("Seçim Yapınız");
            int secim = new Scanner(System.in).nextInt();

            switch (secim) {
                case 1:
                    UserController userController = new UserController();
                    userController.registerUser();
                    break;
                case 2:
                    registerMenu();
                    break;
                case 0:
                    cikis = true;
                    break;
                default:
                    System.out.println("İşlem Başarısız");
                    break;
            }
        } while (!cikis);
    }
    public static void registerMenu() {
        Long kullaniciId = findMyId();
        PostController twitController = new PostController();
        boolean kontrol = false;
        do {
            System.out.println("************");
            System.out.println("1- Post At");
            System.out.println("2- Like Yap");
            System.out.println("3- computer Yap");
            System.out.println("4- bileşenleri Gör");
            System.out.println("5- Computerspec yap");
            System.out.println("0- Cikis Yap");
            System.out.print("Seçim Yapınız: ");
            int secim = new Scanner(System.in).nextInt();

            switch (secim) {
                case 1: PostController.postAt(kullaniciId);
                    break;
                case 2: {
                    for (Post post : PostController.findAll()) {
                        System.out.println(post);
                    }
                    System.out.println("Like Yapmak istediğiniz Id'yi seç: ");
                    Long Id = new Scanner(System.in).nextLong();
                    LikeController likeController = new LikeController();
                    likeController.Likeyap (Id, kullaniciId);break;
                }
                case 3: {
                    for (Post post : PostController.findAll()) {
                        System.out.println(post);
                    }
                    System.out.println("Computer Yapmak için istediğiniz Id'yi seç: ");
                    Long Id = new Scanner(System.in).nextLong();
                    ComputerController computerController = new ComputerController();
                    computerController.computerYap (Id, kullaniciId);break;

                }
                case 4: {bilesenleriGor().forEach(x->{
                    System.out.println(x.toString());
                });break;}

                case 5:



                break;


                case 0:
                    kontrol= true;
                    break;
                default:
                    System.out.println("İşlem Gerçekleştirilemedi");break;
            }
        }while (!kontrol);
    }
    public static Long findMyId() {
        UserController userController1 = new UserController();
        System.out.println("Kullanici Adinizi Giriniz");
        String kullaniciAdi = new Scanner(System.in).nextLine();
        return  userController1.findByColumnNameAndValue("username", kullaniciAdi).get(0).getId();
    }

    public static List<Computer> bilesenleriGor(){
        PostController postController = new PostController();

        EntityManager entityManager = HibernateUtility.getSessionFactory().createEntityManager();
        String sql = "SELECT * FROM tblcomputer  WHERE computerspecid= :x";
        TypedQuery<Computer> query = (TypedQuery<Computer>) entityManager.createNativeQuery(sql, Computer.class);


        for (Post post : postController.findAll()) {
            System.out.println(post);

        }
        System.out.println("Seçmek istediğiniz Post");
        Long id = new Scanner(System.in).nextLong();
        query.setParameter("x",id);
        return query.getResultList();

    }

}