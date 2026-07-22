import React from "react";
import CalculateScore from "./Components/CalculateScore";

function App() {

    return (

        <div>

            <CalculateScore
                Name="Sanjutha"
                School="M Kumarasamy College of Engineering"
                Total={480}
                goal={5}
            />

        </div>

    );

}

export default App;