package com.example.tugasrecycler;

import java.util.ArrayList;

public class BandsDatabase {
    private static String[] vacayPlaces = {
            "BigBang",
            "BlackPink",
            "Exo",
            "Redvelvet",
            "SuperJunior",
            "Girls' Generation",
            "iKON",
            "Twice",
    };

    private static String[] vacayDesc = {
            "Big Bang (Bahasa Korea: 빅뱅) adalah boy band Korea Selatan yang dibentuk oleh YG Entertainment. Dengan anggota G-Dragon, TOP, Taeyang, Daesung, dan Seungri, mereka sering disebut sebagai salah satu tindakan paling berpengaruh untuk membentuk industri K-pop dengan membantu menyebarkan Gelombang Korea secara internasional dan dijuluki sebagai \"Raja K-pop \"oleh media. Penggunaan genre musik yang eksperimental dan beragam, keterlibatan pribadi dalam memproduksi rekaman mereka sendiri, dan pertunjukan panggung telah dikagumi oleh kritikus musik dan menjadi pengaruh bagi banyak artis K-pop dan internasional. ",
            "Blackpink (Korea: 블랙 핑크; biasanya bergaya sebagai BLACKPINK atau BLΛƆKPIИK) adalah grup gadis Korea Selatan yang dibentuk oleh YG Entertainment, yang terdiri dari anggota Jisoo, Jennie, Rosé, dan Lisa. Grup ini memulai debutnya pada Agustus 2016 dengan album single mereka Square One, yang menampilkan \"Whistle\" dan \"Boombayah\", entri nomor satu pertama mereka di Gaon Digital Chart Korea Selatan dan chart Penjualan Lagu Digital Dunia Billboard. Blackpink adalah artis wanita Korea dengan charting tertinggi di Billboard Hot 100, memuncak di nomor 13 dengan \"Ice Cream\" (2020), dan di Billboard 200, memuncak di nomor dua dengan The Album (2020), album pertama yang pernah ada oleh girl grup Korea untuk menjual lebih dari satu juta kopi.",
            "EXO (Bahasa Korea: 엑소; bergaya huruf besar semua) adalah boy band Korea Selatan-Cina yang berbasis di Seoul, terdiri dari sembilan anggota: Xiumin, Suho, Lay, Baekhyun, Chen, Chanyeol, D.O., Kai dan Sehun. Band ini dibentuk oleh SM Entertainment pada tahun 2011 dan memulai debutnya pada tahun 2012. Musik mereka — dirilis dan ditampilkan dalam bahasa Korea, Mandarin, dan Jepang — terutama menggabungkan pop, hip-hop, dan R&B, termasuk elemen genre musik dansa elektronik seperti house dan perangkap. Band ini menduduki peringkat salah satu dari lima selebriti paling berpengaruh di daftar Selebriti Korea Power Forbes dari 2014 hingga 2018 dan telah diberi label \"Kings of K-pop\" dan \"Boyband terbesar di dunia\" oleh berbagai media.",
            "Red Velvet (Korea: 레드 벨벳) adalah grup gadis Korea Selatan yang dibentuk dan dikelola oleh SM Entertainment. Mereka awalnya memulai debutnya pada 1 Agustus 2014 dengan single digital \"Happiness\" dengan formasi empat anggota Irene, Seulgi, Wendy dan Joy. Anggota kelima, Yeri, bergabung dengan grup pada Maret 2015, setelah perilisan besar pertama mereka, Ice Cream Cake. Secara musikal, karya Red Velvet mencerminkan nama grup mereka sendiri: eksperimen sisi \"merah\" mereka yang didominasi pop kadang-kadang dengan elektronik, funk, dan hip hop, sementara sisi \"beludru\" mereka berfokus pada R&B yang dipengaruhi tahun 90-an dengan elemen balada dan jazz . ",
            "Super Junior (Korea: 슈퍼 주니어; Syupeo Junieo), juga dikenal sebagai SuJu, adalah boy band Korea Selatan yang memulai debutnya pada tanggal 6 November 2005, oleh produser Lee Soo-man dari SM Entertainment. Mereka juga dijuluki oleh media sebagai \"Raja Gelombang Hallyu\" karena kontribusi mereka yang menonjol dalam Gelombang Korea. Grup ini terdiri dari total tiga belas anggota pada puncaknya. Super Junior awalnya debut dengan dua belas anggota, terdiri dari leader Leeteuk, Heechul, Han Geng, Yesung, Kangin, Shindong, Sungmin, Eunhyuk, Donghae, Siwon, Ryeowook, dan Kibum. Kyuhyun bergabung dengan grup ini kemudian pada tahun 2006.",
            "Girls 'Generation (Korea: 소녀 시대; RR: Sonyeo Sidae), juga dikenal sebagai SNSD, adalah grup gadis Korea Selatan yang dibentuk oleh SM Entertainment. Grup ini terdiri dari delapan anggota: Taeyeon, Sunny, Tiffany, Hyoyeon, Yuri, Sooyoung, Yoona, dan Seohyun. Awalnya beranggotakan sembilan orang, Jessica keluar dari grup pada September 2014. Salah satu tokoh Korea Selatan terkemuka dan salah satu grup K-pop paling populer di seluruh dunia, Girls 'Generation telah mendapatkan banyak penghargaan dan julukan kehormatan \"Grup Gadis Bangsa \"di negara asal mereka. ",
            "iKon (Korea: 아이콘), bergaya iKON, adalah boy band Korea Selatan yang dibentuk pada tahun 2015 oleh YG Entertainment, terdiri dari enam anggota: Bobby, Jinhwan, Ju-ne, Yunhyeong, Donghyuk dan Chanwoo. Awalnya sebuah band beranggotakan tujuh orang, BI, keluar dari grup pada Juni 2019. Album studio debut mereka Welcome Back (2015), memulai debutnya di puncak Tangga Album Gaon Korea Selatan, menelurkan single nomor satu, \"My Type\", \"Apology \"dan\" Dumb & Dumber \", dan tiga single sepuluh besar,\" Rhythm Ta \",\" Airplane \", dan\" Anthem \". Album ini sukses secara komersial, terjual lebih dari 260.000 eksemplar di Asia.",
            "Twice (Korea: 트 와이스; Jepang: ト ゥ ワ イ ス), biasanya bergaya TWICE, adalah grup gadis Korea Selatan yang dibentuk oleh JYP Entertainment. Grup ini terdiri dari sembilan anggota: Nayeon, Jeongyeon, Momo, Sana, Jihyo, Mina, Dahyun, Chaeyoung, dan Tzuyu. Twice dibentuk di bawah program televisi Sixteen (2015) dan memulai debutnya pada tanggal 20 Oktober 2015, dengan drama diperpanjang (EP) The Story Begins. Pada Desember 2020, grup ini telah menjual lebih dari 10 juta album di Korea Selatan dan Jepang."
    };

    private static int[] vacayImages = {
            R.drawable.bigbang,
            R.drawable.blackpink,
            R.drawable.exo,
            R.drawable.redvelvet,
            R.drawable.superjunior,
            R.drawable.sdsn,
            R.drawable.ikon,
            R.drawable.twice,

    };

    static ArrayList<BandsModel> getListData(){
        ArrayList<BandsModel> list = new ArrayList<>();
        for (int position = 0; position<vacayPlaces.length; position++){
            BandsModel vacay = new BandsModel();
            vacay.setName(vacayPlaces[position]);
            vacay.setSummary(vacayDesc[position]);
            vacay.setPhoto(vacayImages[position]);
            list.add(vacay);

        }
        return list;
    }


}
