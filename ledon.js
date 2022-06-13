var Gpio = require("onoff").Gpio,
    led = new Gpio(17, "out");
    led.write(1, function(){
        console.log("LED on");
    });
