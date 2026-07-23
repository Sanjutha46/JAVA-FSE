import React, { useState } from "react";
import CurrencyConvertor from "./Components/CurrencyConvertor";

function App() {

    const [count, setCount] = useState(0);

    const increment = () => {

        setCount(count + 1);

    };

    const decrement = () => {

        setCount(count - 1);

    };

    const sayHello = () => {

        alert("Hello! Have a Nice Day!");

    };

    const handleIncrement = () => {

        increment();
        sayHello();

    };

    const sayWelcome = (message) => {

        alert(message);

    };

    const syntheticEvent = () => {

        alert("I was clicked");

    };

    return (

        <div style={{ padding: "20px", fontFamily: "Arial" }}>

            <h1>React Event Handling</h1>

            <h2>Counter : {count}</h2>

            <button onClick={handleIncrement}>
                Increment
            </button>

            <button
                onClick={decrement}
                style={{ marginLeft: "10px" }}
            >
                Decrement
            </button>

            <br /><br />

            <button
                onClick={() => sayWelcome("Welcome")}
            >
                Say Welcome
            </button>

            <br /><br />

            <button
                onClick={syntheticEvent}
            >
                OnPress
            </button>

            <CurrencyConvertor />

        </div>

    );

}

export default App;