import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        System.out.println("Enter Dial Up");
        Scanner input=new Scanner(System.in);
        String Dial="*770#";
        double haraga=2000;
        int Pin_code=3703;

        String Dail_Up=input.next();
        if(Dail_Up.equals(Dial)) {
            System.out.println("-EVCPLUS-\nFadlan geli PIN-kaaga(Enter pin)");
            int PIN = input.nextInt();  
            if (Pin_code == PIN) {
                System.out.println(".evcplus\n 1.itus haraaga");
                System.out.println("2.kaarka hadalka");
                System.out.println("3.bixi bilka");
                System.out.println("4.u wareeji evcplus");
                System.out.println("5.warbixin");
                System.out.println("6.salaam bank");
                System.out.println("7.maareynta");
                System.out.println("8.bill payment");
                // Switch ta ugu weyn ee noqabanayo 8 case
                int Soogali = input.nextInt();
                switch (Soogali) {
                    //case 1 itus haraga
                    case 1:
                        System.out.println("[-EVCPlus-] Haraagaagu waa $" + haraga);

                        break;
                    case 2:
                        System.out.println("Kaarka hadalka\n1.Ku Shubo Airtime");
                        System.out.println("2.ugu shub Airtime");
                        System.out.println("3.MIFIpackages");
                        System.out.println("4.ku shubo Airtime");
                        System.out.println("5.ugu shub qof kale MMT");

                        int karka = input.nextInt();
                        //Switch kaan waxa uu suurta gelinaa in mid walba gudaha loogu dhaadhaco

                        switch (karka ) {
                            //case 21 ku shubo artime
                            case 1:
                                System.out.println("Fadlan geli Mobile-ka");
                                int Phone = input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                double lacag = input.nextDouble();

                                System.out.println("Ma Hubtaa inaa $" + lacag+ "ugu shubeysid");
                                System.out.println("1.Haa");
                                System.out.println("2.maya");
                                int Hubin = input.nextInt();
                                if (haraga >= lacag) {
                                    System.out.println(lacag+ "$ ayaad ku shubtay " + Phone +
                                            "\nHaraagaga Hada waa " + (haraga - lacag));
                                } else {
                                    System.out.println("Kuguma filna");
                                }
                                break;

                            case 2://2.Ugu Shub Airtime.

                                System.out.println("Fadlan geli Mobile-ka");
                                int Phone2 = input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                double lacag1= input.nextDouble();
                                System.out.println("Ma Hubtaa inaa $" + lacag1 + "ugu shubeysid");
                                System.out.println("1.Haa");
                                System.out.println("2.maya");
                                int Hubinn = input.nextInt();
                                if (haraga>= lacag1 && Hubinn == 1) {
                                    System.out.println(lacag1+ "$ ayaad Ugu shubtay " + Phone2 +
                                            "\nHaraagaga Hada waa " + (haraga - lacag1));
                                } else {
                                    System.out.println("Kuguma filna");
                                }
                                break;

                            // case 3 kushubo data mifi
                            case 3:

                                System.out.println("EVCplus\n1.ku shubo Data_da MIFI");
                                int data = input.nextInt();
                                //case 3 switch kaan ayaa ugu weyn

                                switch (data) {

                                    case 1:
                                        System.out.println("EVCPlus\n1.Ku shubo Data-da MIFI ");

                                        int option=input.nextInt();
                                        switch (option){
                                            case 1:
                                                System.out.println("--Intenet BundleRecharge--");
                                                System.out.println("1.Isbuucle (Weely)");
                                                System.out.println("2.maalinle(dialy)");
                                                System.out.println("3.bille(mifi)");
                                                int internet= input.nextInt();
                                                switch (internet) {


                                                    // 1.Isbuucle (Weely

                                                    case 1:
                                                        System.out.println("Fadlan dooro Bundle ka\n1.$5 = 10 GB");
                                                        System.out.println("2.$10=25GB");
                                                        System.out.println("Fadlan geli number");
                                                        int phone3 = input.nextInt();
                                                        System.out.println("Fadlan geli lacg");
                                                        double Money = input.nextDouble();
                                                        if (Money == 5) {
                                                            System.out.println("Waxaad ku shubatay $" + Money + " 10 GB");
                                                        } else if (Money == 10) {

                                                            System.out.println("Waxaad ku shubatay $" + Money + " 25 GB");
                                                        } else {
                                                            System.out.println("Waaad ku  shubatay GB");
                                                        }


                                                        break;


                                                    //2.Maalinle(Daily)
                                                    case 2:


                                                        System.out.println("Fadlan dooro Bundle ka\n1.$5 = 10 GB");
                                                        System.out.println("2.$10=25GB");
                                                        System.out.println("Fadlan geli number");
                                                        int phone4 = input.nextInt();
                                                        System.out.println("Fadlan geli lacg");
                                                        double Money2 = input.nextDouble();
                                                        if (Money2 == 5) {
                                                            System.out.println("Waxaad ku shubatay $" + Money2 + " 10 GB");
                                                        } else if (Money2 == 10) {

                                                            System.out.println("Waxaad ku shubatay $" + Money2 + " 25 GB");
                                                        } else {
                                                            System.out.println("Waaad ku  shubatay "+Money2+" GB");

                                                        }
                                                        break;

                                                    // 3.Bille(MiFi)

                                                    case 3:
                                                        System.out.println("Fadlan dooro Bundle ka\n1.$20 = 40 GB");
                                                        System.out.println("2.$40=85GB");
                                                        System.out.println("3.$60=150GB");
                                                        System.out.println("4$30=monthly unlimit");
                                                        int choose = input.nextInt();
                                                        if (choose == 1) {
                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mifi=input.next();
                                                            System.out.println("Waxaad ku shubatay 40GB");

                                                        } else if (choose==2) {

                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mifi1=input.next();
                                                            System.out.println("Waxaad ku shubatay 85GB");
                                                        } else if (choose==3) {
                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mif2=input.next();
                                                            System.out.println("Waxaad ku shubatay 150GB");

                                                        } else if (choose==4) {
                                                            System.out.println("Fadlan geli MIFI user");
                                                            String Mif3=input.next();

                                                            System.out.println("Waxaad ku shubatay Monthly Unlimit");

                                                        }

                                                }
                                        }
                                }
                                break;

                            //case 4.Ku shubo internet
                            case 4:


                                System.out.println("Fadlan dooro number-ka aad ku  shubeyso");
                                System.out.println("1.Isbuucle");
                                System.out.println("2.time based packages");
                                System.out.println("3.data");
                                System.out.println("4.malinle");
                                System.out.println("5.bile");
                                int qeybta= input.nextInt();
                                switch (qeybta) {

                                    // case 1 isbucle

                                    case 1:
                                        System.out.println("Fadlan geli Mobile-ka");
                                        int Phone4 = input.nextInt();
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax + "ku shubatid");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int Hubiin = input.nextInt();
                                        if (haraga >= lacag_kalabax ) {
                                            System.out.println(lacag_kalabax + "$ ayaad ku shubtay " + Phone4 +
                                                    "\nHaraagaga Hada waa " + (haraga - lacag_kalabax));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");
                                        }

                                        // case 2.TIME BASED PACKAGES
                                        break;
                                    case 2:

                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax1 = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax1 + "ku shubatid");

                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int Hubin2= input.nextInt();



                                        if (haraga >= lacag_kalabax1 ) {
                                            System.out.println(lacag_kalabax1 + "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (haraga - lacag_kalabax1));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");
                                        }
//                                        3.DATA case 3
                                        break;
                                    case 3:
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kushubid = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kushubid + "ku shubatid");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int Hubin3 = input.nextInt();
                                        if (haraga >= lacag_kushubid) {
                                            System.out.println(lacag_kushubid+ "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (haraga - lacag_kushubid));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");
                                        }

                                        //4.Maalinle(Daily) case 4
                                        break;
                                    case 4:
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax3 = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax3 + "ku shubatid");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int Hubin4= input.nextInt();
                                        if (haraga >= lacag_kalabax3 ) {
                                            System.out.println(lacag_kalabax3 + "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (haraga - lacag_kalabax3));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");

                                        }


                                        break;
                                    //case 5.Bille(MiFi)
                                    case 5:
                                        System.out.println("Fadlan geli lacagta");
                                        double lacag_kalabax4 = input.nextDouble();
                                        System.out.println("Ma Hubtaa inaa $" + lacag_kalabax4 + "ku shubatid");
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int Hubiinnnn1 = input.nextInt();
                                        if (haraga >= lacag_kalabax4  && Hubiinnnn1 == 1) {
                                            System.out.println(lacag_kalabax4 + "$ ayaad ku shubtay " +
                                                    "\nHaraagaga Hada waa " + (haraga - lacag_kalabax4));
                                        } else {
                                            System.out.println(" Haraagaagu Kuguma filna");

                                        }

                                }
                                //  }
                                break;
                            case 5:
                                System.out.println("Fadlan Geli Mobile-ka");
                                int phone5= input.nextInt();
                                System.out.println("Fadlan geli lacagta");
                                double lacag_kalabax5 = input.nextDouble();
                                System.out.println("Ma Hubtaa inaa $" + lacag_kalabax5 + "ku shubatid");
                                System.out.println("1.Haa");
                                System.out.println("2.maya");
                                int Hubiinnnn2 = input.nextInt();
                                if (haraga >= lacag_kalabax5  && Hubiinnnn2== 1) {
                                    System.out.println(lacag_kalabax5 + "$ ayaad ugu  shubtay " +phone5+
                                            "\nHaraagaga Hada waa " + (haraga - lacag_kalabax5));
                                } else {
                                    System.out.println(" Haraagaagu Kuguma filna");

                                }
                        }
                        break;



                    //3.Bixi biil


                    case 3:
                        System.out.println("Bixi bill\n1.Post Paid");
                        System.out.println("2.ku iibso");
                        int hello = input.nextInt();
                        switch (hello) {
                            //case 1.Post Paid

                            case 1:
                                System.out.println("Post Paid\n1.Ogow biilka");
                                System.out.println("2.bixi bilka");
                                System.out.println("ka bixi bill");
                                int bixi=input.nextInt();
                                switch (bixi){

                                    //.case 2 Bixi Biil

                                    case 2:
                                        System.out.println("Fadlan geli lacgta ");
                                        double kash= input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad bixisid bill lacgtiisu tahay: $" + kash );
                                        System.out.println("1.Haa\n2.Maya");
                                        int hubiii= input.nextInt();
                                        if (hubiii==1) {
                                            System.out.println("Waxaad kala baxday bill dhan $" + kash);
                                            System.out.println("Haraagagu waa $" + (haraga - kash));


                                        }
                                        break;
                                        //case 3.Ka Bixi Bill


                                    case 3:
                                        System.out.println("Fadlan Mobile-ka Geli");
                                        int phone6= input.nextInt();
                                        System.out.println("Fadlan geli lacgta ");
                                        double kash1= input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad ka bixisid bill lacgteedu  tahay: $" + kash1 );
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int hubiiin= input.nextInt();
                                        if (hubiiin==1) {
                                            System.out.println("Waxaad ka bixisay bill dhan $" + kash1);
                                            System.out.println("Haraagagu waa $" + (haraga - kash1));


                                        }

                                }
                                break;

                            //case 2.Ku Iibso


                            case 2:
                                System.out.println("Fadlan Geli aqoonsiga ganaacsigada");
                                String ganac = input.next();
                                System.out.println("Waad ku guuleysatay");
                        }
                        break;



                    //4.U wareeji EVCPlus


                    case 4:
                        System.out.println("Fadla Geli Mobile_ka");
                        int phpone = input.nextInt();
                        System.out.println();
                        System.out.println("Soo gali Lacagta");
                        double money= input.nextDouble();
                        System.out.println("Waxaad lacag ku wareejisay Numberka " + phpone + " $" + money +
                                "\nHaraagaagu waa $" + (haraga- money));
                        break;



                    //5.warbixin Kooban


                    case 5:
                        System.out.println("Warbixin Kooban\n1.Last Action");
                        System.out.println("2.wareejinta udan beyse");
                        System.out.println("3.iibsashadii u dambeyse");
                        System.out.println("4.last 3 action");
                        System.out.println("5.email me my activity");

                        int chec5 = input.nextInt();

                        if (chec5 == 1) {
                            System.out.println("$10 ayad uwaejisay 252617225775 Tariiiqda waa 19/05/25 12:32:37");
                        } else if (chec5 == 2) {
                            System.out.println("fadlan geli numberka");
                            int num = input.nextInt();
                            System.out.println("$5 ayaad udirtay 252619035566 11/04/23 13:25:54");

                        } else if (chec5 == 3) {
                            System.out.println("fadlan geeli kaarka aqoonsiga ganacsiga");
                            int kaarkaganacsiga = input.nextInt();
                            System.out.println("operation succeeded no transaction to display");
                        } else if (chec5 == 4) {
                            System.out.println("$5 ayaad kaheshay 252619098765 11/04/23 13:25:54");

                        } else if (chec5 == 5) {

                            System.out.println("fadlan geli email-kaga");
                            String Email = input.next();


                            System.out.println("fadlan geli taariiqda hore(maalin/bisha/sanad");
                            String taariiq = input.next();

                            System.out.println("fadlan geli taariiqda dambe(malin/bisha/sanad");
                            String Taariiq = input.next();
                            System.out.println("your request is being processed and the activity will be emaile to "+Email);


                        }
                        break;


                    //6.  Salaam Bank

                    case 6:
                        System.out.println("Salaam Bank ");
                        System.out.println("1.Itus Haraaga");
                        System.out.println("2.lacag dhigasho");
                        System.out.println("3.lacag qadasho");
                        System.out.println("4.ka wareeji evcplus");
                        System.out.println("5.kawareeji account kaga");
                        System.out.println("6.hubi wareejin account");
                        System.out.println("7.maareynta banki");
                        System.out.println("8maareynta banki");
                        int banki = input.nextInt();

                        int lac = 1000;

                        int Number_sir = 123456;

                        // switch nohayo 8 dorasho ee bankiga
                        switch (banki) {


                            //case 1.Itus Haraaga
                            case 1:
                                System.out.println("Fadlan Geli Number kaaga sirta Ee Bankiga");


                                int Hubinn = input.nextInt();
                                if (Hubinn == Number_sir) {

                                    System.out.println("Haraagaagu Bankiga waa $" + lac + " USD");
                                } else {
                                    System.out.println(" PIN-kaaga Bankiga waa Khalad");
                                }
                                //case 2 lacag dhigasho
                            case 2:
                                System.out.println("Fadlan Geli lacagta");
                                double in = input.nextInt();
                                System.out.println(" Waxaad dhigatay bankiga lacg dhan $" + in + " Haraagaagu bankiga waa " + (in + lac + " USD"));
                                break;
                                // case 3 lacag baxis
                            case 3:
                                System.out.println("Fadlan Geli lacagta");

                                double out = input.nextInt();
                                System.out.println("Fadlan Geli Macluumd");
                                String maclumad = input.next();
                                System.out.println("Fadlan geli Numberkaaga Sirta ee bankiga");
                                int jj = input.nextInt();
                                if (jj == Number_sir) {
                                    if (out <= lac) {
                                        System.out.println("Waxaad kala baxday lacg dhan $" + out);
                                        System.out.println("Haraagaagu Bankiga waa $" + (lac - out) + " USD");
                                    } else {
                                        System.out.println("Kuguma filna");
                                    }

                                } else
                                    System.out.println("waa khalad");
                                break;
                                //case 4 ka wareeji evcplus
                            case 4:
                                System.out.println("Fadlan dooro xisaabta bankiga");
                                System.out.println("1.salaam sch");
                                System.out.println("2.salaam somali bank");
                                System.out.println("3.darusalaam bank");
                                System.out.println("4.bank beeraha");
                                int doorasho = input.nextInt();
                                switch (doorasho) {
                                    //case 1 dora xisabta bank
                                    case 1:
                                        System.out.println("Fadlan geli Account-ka");
                                        int account1 = input.nextInt();
                                        System.out.println("Fadlan geli macluumaadka");
                                        String maclumad1 = input.next();
                                        System.out.println("Fadlan geli lacgta");
                                        double lacg4 = input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Evcplus: $" + lacg4);
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int hubb = input.nextInt();
                                        if (hubb == 1) {
                                            System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg4);
                                            System.out.println("Haraagagu  bankigu waa $" + (lac + lacg4));


                                        }
                                        break;
                                        // case 2 salaam sch

                                    case 2:
                                        System.out.println("Fadlan geli Account-ka");
                                        int account = input.nextInt();
                                        System.out.println("Fadlan geli macluumaadka");
                                        String mac = input.next();
                                        System.out.println("Fadlan geli lacgta");
                                        double lacg3 = input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Evcplus: $" + lacg3);
                                        System.out.println("1.Haa\n2.Maya");
                                        int hub = input.nextInt();
                                        if (hub == 1) {
                                            System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg3);
                                            System.out.println("Haraagagu  bankigu waa $" + (lac + lacg3));


                                        }
                                        break;
                                        //case darusalaam bank
                                    case 3:
                                        System.out.println("Fadlan geli Account-ka");
                                        int account2 = input.nextInt();
                                        System.out.println("Fadlan geli macluumaadka");
                                        String mac2 = input.next();
                                        System.out.println("Fadlan geli lacgta");
                                        double lacg6 = input.nextDouble();

                                        System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Evcplus: $" + lacg6);
                                        System.out.println("1.Haa");
                                        System.out.println("2.maya");
                                        int hub2 = input.nextInt();
                                        if (hub2 == 1) {
                                            System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg6);
                                            System.out.println("Haraagagu  bankigu waa $" + (lac + lacg6));


                                        }


                                }
                                break;

                                //case 5 kawareeji account kaga
                            case 5:
                                System.out.println("Fadlan geli Account-ka Ama Mobile ");
                                int phones = input.nextInt();

                                System.out.println("Fadlan geli macluumaadka");
                                String mac3 = input.next();
                                System.out.println("Fadlan geli lacgta");
                                double lacg7 = input.nextDouble();
                                System.out.println("Fadlan gelin Number_siredka Account-ka ");
                                int user = input.nextInt();
                                if (user == Number_sir) {


                                    System.out.println("Ma Hubtaa inaa aad kasoo wareejisid Account-ka: $" + lacg7);
                                    System.out.println("1.Haa");
                                    System.out.println("2.maya");
                                    int hub8 = input.nextInt();
                                    if (hub8 == 1) {
                                        System.out.println("Waxaad soo wareejisay lacag  dhan $" + lacg7);
                                        System.out.println("Haraagagu  Evcplus waa $" + (haraga + lacg7));


                                    }
                                }else
                                    System.out.println("Waa khalad Number-ka sirta");
                                break;
                                //case 6 hubi wareejin account
                            case 6:
                                System.out.println("Fadlan geli OTP");
                                String OTP= input.next();
                                System.out.println("Waad ku guuleysaty OTP");
                                break;
                                //case 7 maareynta banki
                            case 7:
                                System.out.println("Maareynta Bankiga \n1.Bedel PIN-ka Bankiga");
                                System.out.println("2.bedel passwordka EBANK");

                                int Maareynta= input.nextInt();
                                switch (Maareynta){
                                    //case 1 bedel pin bankiga
                                    case 1:
                                        System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                        int sir= input.nextInt();
                                        if (sir==Number_sir){
                                            System.out.println("Fadlan geli PIN-ka cusub ee bankiga");
                                            int Sir_cusb= input.nextInt();
                                            System.out.println("Waa laguu bedelay PIN_ka Bankiga");
                                        }else
                                            System.out.println("Waa khalad");
                                        //case 2 bedel passoword
                                    case 2:
                                        System.out.println("Fadlan geli Numberkaaga sirta ee bankiga");
                                        int sir1= input.nextInt();
                                        if (sir1==Number_sir){
                                            System.out.println("Fadlan geli PIN-ka cusub ee Ebankiga");
                                            int Sir_cusb1= input.nextInt();
                                            System.out.println("Waa laguu bedelay PIN_ka EBankiga");
                                        }else
                                            System.out.println("Waa khalad");
                                }
                                break;
                                //case 8 kalabax
                            case 8:
                                System.out.println("Fadlan geli Aqqonsiga codsiga");
                                String codsi= input.next();
                                System.out.println("Mahadsanid!");


                        }

                        break;


                    //Maareynta

                    case 7:
                        System.out.println("Maareynta \n1.Bedel lambarka sirta ah");
                        System.out.println("2.bedel luuqada");
                        System.out.println("3.wargelin mobile lumay");
                        System.out.println("4.lacag xirasho");
                        System.out.println("5.u celi lacag qaldantay");

                        int mareynta= input.nextInt();
                        switch (mareynta){
                            case 1:
                                System.out.println("Fadlan Geli PIN-kaagu Cusub");
                                int bin= input.nextInt();
                                Pin_code=bin;

                                System.out.println("Waa laguu bedelay Numberka sirta");
                                break;
                            case 2:
                                System.out.println("Fadlan dooro luqada\n1.English");
                                System.out.println("2.soamali");
                                int luqad=input.nextInt();
                                switch (luqad){
                                    case 1:
                                        System.out.println("Waxaad dooratay Luqada English");
                                        break;
                                    case 2:
                                        System.out.println("Waxaad dooratay Luqada Somali");
                                }
                                break;
                                //case 3 number lumay
                            case 3:
                                System.out.println("fadlan gali numbar lumay");
                                int lumay = input.nextInt();
                                System.out.println("fadlan gali pinka numbarka lumay");
                                int pin_lumay = input.nextInt();
                                System.out.println("mahubta ina numbarkan "+lumay+" loo diwan galiyo lumid ");
                                System.out.println("1 Haa");
                                System.out.println("2 Maya");
                                int num_lumay =input.nextInt();
                                if(num_lumay == 1){
                                    System.out.println("waad ku gulesatay ina u diwan galiso lumid "+lumay+" mahadsanid");
                                }else
                                    System.out.println("mahadsanid");
                                break;
                               // case 4 lacag xirasho
                            case 4:
                                System.out.println("fadlan gali numbarka lagu  qalday");
                                int num_qalday = input.nextInt();
                                System.out.println("fadlan gali numbarka loo rabay");
                                int num_lorabay = input.nextInt();
                                System.out.println("fadlan gali macluumaad");
                                String macluumaad = input.next();
                                System.out.println("mahubta ina xirato lacagtan ");
                                System.out.println("1 haa");
                                System.out.println("2 maya");

                                int hubi_xirasho = input.nextInt();
                                switch (hubi_xirasho){
                                    case 1:
                                        System.out.println("waad ku gulesaty ina xirato lacagtan");
                                        break;
                                    case 2:
                                        System.out.println("mahadsanid");
                                        break;
                                }
                                break;
                                //case 5 lacag soqaldantay
                            case 5:
                                System.out.println("fadlan gali  lacagta");
                                int aqonsi_lacag = input.nextInt();
                                System.out.println("Fadlan geli Number-ka");
                                int mobile=input.nextInt();
                                System.out.println("fadlan gali macluumad");
                                String maclumaad = input.next();
                                System.out.println("mahubta ina lacag u celiso numbarkan ");
                                System.out.println("1 haa");
                                System.out.println("2 maya");
                                int celin = input.nextInt();
                                switch (celin){
                                    case 1:
                                        System.out.println("waad ku gulesatay ina celiso lacagta");
                                        break;
                                    case 2:
                                        System.out.println("mahadsanid");
                                        break;
                                }






                        }








                    //Bill Payment
                    case 8:
                        System.out.println("EVCPlus \n1.Itus haraagaaga biil ka");
                        System.out.println("2.wada bixi bill");
                        System.out.println("qeyb kabixi bilka");


                        int dorashada=input.nextInt();
                        if(dorashada==1){
                            System.out.println("fadlan geli bill reference number");
                            int bill_refrence=input.nextInt();
                            System.out.println("-Evcplus-} haraagagu waa $"+haraga);
                        } else if (dorashada==2) {
                            System.out.println("fadlan geli bill reference number");
                            int billrefrence_num=input.nextInt();
                            System.out.println("invalid input parameter");
                        } else if (dorashada==3) {
                            System.out.println("fadlan geli bill reference number");
                            int billrefrence_nums=input.nextInt();
                            System.out.println("invalid input parameter");
                        }




                }


            }else
                System.out.println("PIN-kaagu waa khalad ");



        }else
            System.out.println("Waxaad Ku soo gali gartaa *770#");

    }
}

