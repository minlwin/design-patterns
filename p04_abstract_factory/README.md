## Abstract Factory Pattern

Application တစ်ခုကို ရေးသားတဲ့ အခါ Component Group တွေကို Family အလိုက် အသုံးပြုလိုတဲ့ အခါမျိုးမှာ Abstract Factory Pattern ကို ရွေးချယ် အသုံးပြုသင့်ပါတယ်။


<img src="class-diagram.png" width="900px" />

အထက်ပါနမူနာထဲက GuiApp မှာ Button နှင့် Dialog များကို အသုံးပြုနေပြီး Family အလိုက် Implementation Class တွေလဲ ရေးသားထားပြီး၊ Family အလိုက် Dialog တွေ Button တွေကို အသုံးပြုနိုင်ဖို့လိုအပ်ပါတယ်။

ComponentsFactory Class ကို Abstract Factory အနေနဲ့ ရေးသားထားပြီး၊ လိုအပ်တဲ့ Component တွေကို Create လုပ်ပေးဖို့အတွက် Abstract Factory Method တွေကို ရေးသားထားပါတယ်။ Family အလိုက် Component တွေကို Create လုပ်နိုင်ဖို့အတွက် Concrete Implementation တွေအဖြစ် MacComponentsFactory နှင့် WindowsComponentsFactory တို့ကို ရေးသားထားပါတယ်။

MacComponentsFactory ကနေ MacButton နှင့် MacDialog တို့ကို Generate လုပ်ပေးနိုင်ပြီး၊ WindowsComponentsFactory ကနေ WindowsButton နှင့် WindowsDialog ကို Generate လုပ်ပေးနေပါတယ်။ GuiApp ကို Windows Family အနေနဲ့ အသုံးပြုလိုချင်ရင် WindowsComponentsFactory နှင့်တွဲဖက် အသုံးပြုနိုင်ပြီး၊ Mac Family အနေနဲ့ အသုံးပြုလိုပါက MacComponentsFactory နှင့် တွဲဖက် အသုံးပြုနိုင်ပါတယ်။

Abstract Factory Pattern ကတော့ Family အလိုက် Product တွေကို တည်ဆောက်ပေးနိုင်တဲ့ Design Pattern တစ်ခုဖြစ်ပါတယ်။

### Implementations

- Product တွေနဲ့ Factory Class တွေကို Abstraction ဖြစ်အောင် Interface ဒါမှမဟုတ် Abstract Class ကို အသုံးပြုရေးသားနိုင်ပါတယ်
- Product တွေမှာလဲ Family အလိုက် Implementation တွေရှိကြပါတယ်
- Abstract Factory ထဲမှာ Product တွေကို တည်ဆောက်ဖို့အတွက် Abstract Method တွေကို ရေးသားထားရပါမယ်
- Family အလိုက် Factory Class တွေက Abstract Factory ကို Implements / Extends လုပ်ပြီး Factory Method တွေကို Override လုပ်တဲ့အခါမှာ Family အလိုက် Product တွေကို Create လုပ်ပေးဖို့လိုအပ်ပါတယ်
- Abstract Factory Pattern ကို အသုံးပြုခြင်းအားဖြင့် Client နှင့် Product Details Implementation တွေ၊ Factory တွေကို Decouple လုပ်ပေးနိုင်ပြီး Reusability  ကိုမြင့်မားအောင် ဆောင်ရွက်ပေးနိုင်မှာ ဖြစ်ပါတယ်

<small>Abstract Factory</small>

```
public interface ComponentsFactory {

	Button createButton();
	Dialog createDialog();
}
```


<small>Concrete Factory Class</small>

```
public class MacComponentFactory implements ComponentsFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Dialog createDialog() {
		return new MacDialog();
	}
}
```

<small>Client Class</small>

```
public class GuiApp implements Component{
	
	private Button button;
	private Dialog dialog;
	
	public GuiApp(ComponentsFactory factory) {
		this.button = factory.createButton();
		this.dialog = factory.createDialog();
	}

	@Override
	public void draw() {
		dialog.draw();
		button.draw();
	}

}
```

<small>Usage</small>

```
public class GuiAppMainForMac {

	public static void main(String[] args) {
		
		var app = new GuiApp(new MacComponentFactory());
		app.draw();
	}
}
```
