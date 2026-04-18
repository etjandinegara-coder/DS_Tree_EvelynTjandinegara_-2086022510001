1. Yang menjadi root node dalam program ini adalah 'Start Build'

2. Node yang menjadi leaf adalah 'Dagger One' , 'Dagger Two' , 'Javelin One' , 'Javelin Two' , 'Mystic Codex One' , ' Mystic Codex Two' , 'Boots' , 'Hero's Ring' , 'Immortality'.

3. Penggunaan List<ItemNode> agar satu node dapat menyimpan beberapa anak sedangkan kalau menggunakan variable maka satu node hanya bisa menyimpan satu anak.

4. Perbedaannya adalah struktur linear seperti array memiliki data yang berurutan dan punya satu next seperti kondisi yang mirip itu ada 'Exotic Veil' ke 'Mystic Codex One' yang tidak punya cabang dan hanya punya satu jalur tapi tetap merupakan bagian dari strukutr tree sedangkan struktur tree yang memperlihatkan lebih banyak kemungkinan jalur seperti 'Start Build' ke 'Berserker's Fury' , 'Genius Wand' , 'Magic Shoes' dan 'Immortality' memiliki cabang lebih dari satu dan beberapa jalur, tiap node bisa punya child juga.

5. Rekursi membantu ketika ingin mencari jalan ke target dari root karena setiap node akan memproses menggunakan perulangan yang sama. Dengan ini menyederhanakan operasi mencari, menghitung total nodes, menghitung total leaves, dll.

6. Jalur yang akan keluar adalah Start Build-> Golden Staff-> Corrosion Scythe


Reflection

Setelah mengerjakan tugas ini, saya dapat memahami struktur data tree dan bisa merealisasikannya ke dalam bentuk kode. Tree sendiri merupakan struktur data dengan model hierarki yang mirip seperti pohon dengan struktur bercabang yang dibuat dari node. Dibandingkan struktur data linear, struktur data tree lebih fleksibel digunakan karena satu node dapat memiliki beberapa cabang. Dengan penggunaan struktur data tree, lebih mudah dalam mencari berbagai kemungkinan jalur yang dapat di temukan. Saya juga belajar hubungan antara root, child dan leaf. 

Kemudian pada bagian method saya kembali mempelajari konsep rekursi yang ada pada week sebelumnya. Melalui method 'printAllBuildPaths()','countNodes()','countLeaves()','height()','findPath()','countItemOccurrences()','printPathsToImmortal()'. Saya jadi memahami bagaimana penggunaan rekursi yang bekerja dengan memanggil fungsi yang sama terus menerus, berulang kali untuk setiap child node. Saya banyak mengubah struktur tree yang ditentukan dengan feedback saya dapat mengerti kode dengan lebih baik dan hal tersebut membuat saya lebih banyak belajar. # DS_Tree_EvelynTjandinegara_-2086022510001
