# Sorting Algorithms Activity (IT20 - Data Structures and Algorithms)

## Bahin sa Java Program
Kini nga Java program nga ginganlan og `SortingAlgorithms.java` naghan-ay (sort) sa usa ka listahan sa napulo (10) ka wala nagkasunod-sunod nga mga numero ngadto sa ascending order (gikan sa kinagamyan padulong sa kinadak-an). Naghimo ang program og tulo ka bulag nga kopya sa original nga array aron dili mausab ang sinugdanang datos, ug gigamit niini ang **Bubble Sort**, **Selection Sort**, ug **Insertion Sort** sa matag kopya before i-print ang original ug ang nahuman na nga resulta.

---

## Giunsa Pagtrabaho ang Matag Sorting Algorithm

### 1. Bubble Sort
Ang Bubble Sort nagtrabaho pinaagi sa pagtandi sa duha ka magtapad nga numero sa array. Kung mas dako ang numero sa wala kaysa sa tuo, magbaylo sila og pwesto (*swap*). Balik-balikon kini nga proseso gikan sa sinugdanan hangtod sa tumoy sa listahan. Sa matag human sa usa ka tuyok (*pass*), ang kinadak-ang numero hinay-hinay nga mosaka o "molutaw" (*bubble up*) padulong sa pinakaulahi nga bahin sa array hangtod nga mahan-ay na ang tanan.

### 2. Selection Sort
Ang Selection Sort nagbahin sa array ngadto sa duha ka parte: ang nahuman na og han-ay sa wala ug ang wala pa mahan-ay sa tuo. Sa matag tuyok, pangitaon niini ang **pinakagamay nga numero** sa tibuok wala pa mahan-ay nga bahin. Kung makit-an na kini, ibaylo kini og pwesto sa pinakaunang numero sa wala pa mahan-ay nga bahin. Magpadayon kini og abante og usa ka lakang sa matag tuyok hangtod maplastar ang tanang numero.

### 3. Insertion Sort
Ang Insertion Sort nagkuha og usa ka numero (*key*) gikan sa wala pa mahan-ay nga bahin ug isukip (*insert*) kini sa saktong pwesto sulod sa bahin nga nahan-ay na sa wala. Aron makasulod ang bag-ong numero, i-irog (*shift*) niini patuo ang tanang numero nga mas dako kaysa niini. Susama kini sa paghan-ay og baraha sa kamot diin kuhaon nimo ang sunod nga baraha ug ibutang sa tukma niining lugar.

---

## Mga Kalainan sa Tulo ka Sorting Algorithms

| Sukdanan | Bubble Sort | Selection Sort | Insertion Sort |
| :--- | :--- | :--- | :--- |
| **Pamaagi sa Paglihok** | Magbaylo dayon sa duha ka magtapad nga numero kung sayop ang han-ay. | Pangitaon una ang pinakagamay sa tibuok listahan una mag-swap. | Kuhaon ang usa ka numero ug i-irog ang mas dagko aron isukip kini. |
| **Kadaghanon sa Swap** | Daghan kaayo og *swaps* tungod kay kada tupad nga sayop ilisan dayon. | Usa ra ka *swap* sa matag tuyok (*pass*). | Walay *swap*, kondili pag-irog (*shifting*) sa mga numero. |
| **Kaanindot sa Dagan kung Hapit na Nahan-ay** | Hinay gihapon kung walay dugang nga *flag* kay motuyok gihapon sa tanan. | Pareho gihapon ang kadugayon kay mangita gihapon sa pinakagamay matag tuyok. | Paspas kaayo kay mohunong dayon ang pagsusi kung sakto na ang pwesto. |

---

## Mga Tubag sa Reflection Questions

### 1. Giunsa paghan-ay sa matag sorting algorithm ang mga numero? Unsay nakapalahi sa ilang proseso?
* **Bubble Sort:** Magtupad-tupad og tandi ug mag-swap dayon hangtod ang pinakadakong numero moadto sa tumoy.
* **Selection Sort:** Mangita una sa kinagamyan nga numero sa tibuok nabilin nga listahan ug ibutang kini sa atubangan.
* **Insertion Sort:** Magtukod og gamay nga nahan-ay na nga grupo sa wala, dayon isukip ang sunod-sunod nga numero sa saktong pwesto pinaagi sa pag-irog sa mas dagkong numero.
* **Nakapalahi:** Ang Bubble Sort magsigeg baylo sa magtapad; ang Selection Sort maghulat una makit-an ang pinakagamay usa magbaylo; samtang ang Insertion Sort mag-irog og mga numero aron makahimo og bakante nga lugar para sa isukip nga numero.

### 2. Sa tulo ka sorting algorithms, asa niini ang pinakasayon sabton ug buhaton sa code? Ngano man?
Para nako, ang **Selection Sort** (o *Bubble Sort*) ang pinakasayon sabton ug i-code. Sa Selection Sort, natural kaayo ang iyang lohika tungod kay mao sab kini ang buhaton sa tawo kung maghan-ay og mga butang sa tinuod nga kinabuhi—mangita sa pinakagamay, ibutang sa una, dayon mangita na sab sa sunod nga pinakagamay. Sa code, klaro kaayo ang trabaho sa duha ka *loop*: ang gawas nga *loop* para sa kasamtangang pwesto, ug ang sulod nga *loop* para sa pagpangita sa `minIndex`.

### 3. Kung ang mga numero nahan-ay na daan (already sorted), asa nga algorithm ang mas maayo og performance? Ipasabot base sa ilang pagtrabaho.
Ang **Insertion Sort** ang pinakamaayo og performance kung nahan-ay na daan ang mga numero. Base sa iyang code, tan-awon ra sa matag numero (`key`) ang numero nga naa sa iyang wala (`arr[j] > key`). Tungod kay nahan-ay na man daan ang listahan, dili na tinuod ang kondisyon nga `arr[j] > key`, busa dili na mosulod ang program sa `while` loop ug walay mahitabong pag-irog (*shifting*). Mahuman dayon kini sa usa lang ka diretso nga pag-agi (*linear time*). Lahi kini sa standard nga Bubble Sort ug Selection Sort nga motuyok gihapon sa tanang *nested loops* bisan og sakto na ang pagkahan-ay sa array.

### 4. Unsay mahitabo kung dugangan pa og daghang numero ang array? Giunsa niini pag-apekto ang performance sa matag algorithm?
Kung dugangan og daghang numero ang array (pananglitan, gikan sa 10 mahimong liboan ka numero), modako pag-ayo ang gidaghanon sa pagtandi (*comparisons*) ug pagbalhin sa mga numero, maong mohinay ang pagdagan sa program. Tungod kay ang tulo ka algorithm pulos adunay *nested loops* ($O(n^2)$), ang oras sa pagproseso modako og katumbas sa kwadrado sa gidaghanon sa datos. Ang Bubble Sort ang kasagarang pinakahinay tungod sa kadaghan sa *swaps* nga buhaton niini, samtang ang Selection Sort ug Insertion Sort mas gaan og gamay tungod kay mas gamay ang pagbalhin-balhin sa memorya, apan pulos gihapon sila mohinay kung sobra na kadaghan ang datos.

### 5. Isip usa ka umaabot nga programmer, nganong importante nga masabtan ang lain-laing sorting algorithms imbes nga usa ra ang gamiton?
Importante nga makahibalo kita sa lain-laing sorting algorithms tungod kay dili pareho ang sitwasyon sa matag problema o sistema nga atong himoon. Adunay mga higayon nga gamay ra ang datos o hapit na kini nahan-ay, diin maayo gamiton ang Insertion Sort; adunay sab mga higayon nga gusto natong minusan ang pagsulat o pag-swap sa memorya, diin mas haom ang Selection Sort; ug kung minilyon na ang datos, masabtan nato nganong kinahanglan mogamit og mas paspas nga algorithms sama sa Merge Sort o Quick Sort. Ang pagsabot sa ilang kalainan makatabang kanato sa paghimo og mas paspas, episyente, ug maayo nga mga program.
