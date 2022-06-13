var Gpio = require("onoff").Gpio,
    led = new Gpio(17, "out");
    led.write(0, function(){
        console.log("LED off");
    });