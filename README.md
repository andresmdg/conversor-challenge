# conversor-challenge
Proyecto de un conversor de divisas para el challenge de Alura

                        Table
 
  fromCurrency    |   toCurrency    |    Rate
     USD                EUR             0.95 EUR per USD
     USD                MXN             18 MXN per USD
     USD                GBP             0.84 GBP per USD
     USD                JPY             136.09 JPY per USD
     USD                KPW             900 KPW per USD


MXN A EUR

100mxn / 18mxn por usd = 55.55
55usd * 0.95 usd por eur
```
conversor-challenge
├─ .gitignore
├─ README.md
└─ src
   ├─ Main.java
   └─ com
      ├─ exchange
      │  ├─ Velocity
      │  ├─ Volume
      │  ├─ Weight
      │  └─ currencies
      │     ├─ Convert.java
      │     ├─ Currency.java
      │     ├─ Eur.java
      │     ├─ Gbp.java
      │     ├─ Jpy.java
      │     ├─ Kpw.java
      │     └─ Mxn.java
      └─ gui
         ├─ components
         │  ├─ Button.java
         │  ├─ Dialog.java
         │  ├─ Input.java
         │  └─ List.java
         └─ window
            ├─ Exchange.java
            ├─ Exit.java
            └─ Window.java

```