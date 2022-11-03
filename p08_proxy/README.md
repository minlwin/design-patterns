## Proxy Pattern

Proxy Pattern ဆိုတာကတော့ Structural Design Pattern အမျိုးအစားတစ်ခုဖြစ်ပြီး၊ Target Object တစ်ခုကို တိုက်ရိုက်ဆက်သွယ်ပြီး အလုပ်မလုပ်စေလိုတဲ့အခါမှာ ကိုယ်စား Object တစ်ခုကို ခံပြီး အသုံးပြုစေနိုင်တဲ့ Design Pattern ဖြစ်ပါတယ်။ Proxy ရဲ့ General Definition မှာကိုက "authority or power to act for another" လို့ဆိုတဲ့အတွက် ကိုယ်စားဆောင်ရွက်ပေးနိုင်တဲ့ သဘောသက်ရောက်ပါတယ်။

Proxy Pattern ကို Java Framework တွေအတော်များများမှာ တွေ့ရတတ်ပါတယ်။ 

- EJB ရဲ့ Remote Bean တွေနှင့် RMI Specification တွေမှာလဲ Proxy တွေကို အသုံးပြုထားကြပါတယ်
- JPA ရဲ့ Entity Object တွေဟာလဲ Proxy တွေဖြစ်ကြပြီး၊ Lazy Loaded Attribute တွေကို Setter Method ကနေ Access လုပ်တဲ့အခါမှာ Database ကနေ Fatch လုပ်နိုင်အောင် ဆောင်ရွက်ပေးကြပါတယ်
- Spring AOP မှာလဲ Cross Cutting ကို ဆောင်ရွက်နိုင်အောင် Proxy တွေကို အသုံးပြုကြပါတယ်
- Object တွေရဲ့ Access Control ကို ဆောင်ရွက်လိုတဲ့ အခါတွေမှာလဲ Proxy တွေကို အသုံးပြုကြပါတယ်

### Implementation

နမူနာအနေနဲ့ Search Engine တစ်ခုရှိပြီး၊ အဲ့ဒီ Search Engine မှာ Data တွေကို ရှာရတာ Resource တွေကို အရမ်းသုံးရပြီး အချိန်ကြာနိုင်တယ်လို့ ဆိုကြပါစို့။ အဲ့ဒီအခါမျိုးမှာ ကျွန်တော်တို့အနေနဲ့ တစ်ခါရှာထားပြီးသားစကားလုံးကို Cache ထဲမှာ သိမ်းထားပြီး Cache ထဲမှာမရှိမှသာ Search Engine ကို အသုံးပြုပြီးရှာမယ်လို့ လုပ်ချင်ပါလိမ့်မယ်။ အဲ့ဒီလိုအခါမျိုးတွေမှာ Proxy Pattern ကို အသုံးပြုနိုင်ပါတယ်။

<img src="class-design.png" width="90%" />

#### Target Interface


#### Proxy Class


### JDK Dynamic Proxy