# ActivityInteractionKotlin
Kotlin demostration of switching activities in Android App on interaction of a button

## Introduction
Kotlin is the new language that can be used to make android apps and is pretty awesome to use to use too. 
This is a sample Kotlin project to show how to interact with activities on an click event.

## Implementation
```
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById(R.id.button)

        button.setOnClickListener(){
            setContentView(R.layout.activity_main2)
        }
```
