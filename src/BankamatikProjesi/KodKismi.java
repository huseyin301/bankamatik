package BankamatikProjesi;

import java.util.Scanner;

public class KodKismi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int login, password, controlP, right = 3, select, price = 0, blance = 0, minus;

        boolean isError = true;

        System.out.println("\nHöşgeldiniz. Lütfen bir kayıt işlemi oluşturunuz. \n");

        System.out.print("Lütfen kullanıcı adı giriniz : ");
        String userName = sc.nextLine();

        do {

            System.out.print("Kayıt işlemi için 1 çıkış yapmak için 2 yazınız : ");
            login = sc.nextInt();

            if (login == 1 || login == 2) {

                isError = false;

            } else {

                System.out.println("Yanlış tuşlama yapıldı.");

            }

        } while (isError);

        isError = true;

        switch (login) {

            case 1:

                System.out.print("Lütfen şifre giriniz (Sadece Sayı) : ");
                password = sc.nextInt();

                System.out.println("Kayıt işlemi başarıyla gerçekleştirildi.\n");

                System.out.println("İşlem yapmaya devam etmek için giriş yapınız");

                for (int i; isError == true; ) {

                    System.out.print("Şifre : ");
                    controlP = sc.nextInt();

                    if (controlP == password) {

                        System.out.println("\nSisteme başarıyla giriş yapıldı.\nHOŞGELDİNİZ " + userName);
                        System.out.println();

                        do {

                            System.out.println("\nYapmak istediğiniz işlemi seçiniz ;\n");

                            System.out.println("Para yatırma (1) :\nPara çekme (2) :\nBakiye sorgulama (3) :\nÇIKIŞ (4) :");
                            System.out.print("Seçiminiz : ");
                            select = sc.nextInt();

                            switch (select) {

                                case 1:

                                    do {

                                        System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                                        price = sc.nextInt();

                                        if (price > 0) {

                                            isError = true;

                                        } else {

                                            isError = false;

                                            price = 0;

                                        }


                                        blance += price;

                                    } while (isError == false);

                                    break;

                                case 2:

                                    do {

                                        System.out.print("Çekmek istediçiniz tutarı giriniz : ");
                                        minus = sc.nextInt();

                                        if (minus > 0) {

                                            isError = true;

                                        } else {

                                            isError = false;

                                            minus = 0;

                                        }

                                        blance -= minus;

                                    } while (isError == false);


                                    break;

                                case 3:

                                    System.out.println("Bakiyeniz : " + blance);

                                    break;

                                case 4:

                                    System.out.println("Sistemden çıkış yapıldı, iyi günler dileriz");

                                    isError = false;

                                    break;
                            }

                        } while (isError == true);


                    } else {

                        System.out.println("Yanlış şifre.\nkalan deneme hakkı : " + --right);

                        if (right <= 0) {

                            isError = false;

                        }

                        if (isError == false) {

                            System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");

                        }

                    }

                }

                break;

            case 2:

                System.out.println("Sistemden çıkış yapıldı, iyi günler dileriz");

                break;

        }

    }
}
