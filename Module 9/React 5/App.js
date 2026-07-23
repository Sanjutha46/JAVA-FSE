import React from "react";
import CohortDetails from "./CohortDetails";

function App() {

    const cohorts = [

        {
            name: "INTADMDF10 .NET FSD",
            startedOn: "22-Feb-2022",
            status: "ongoing",
            coach: "Nisha",
            trainer: "Apoorv"
        },

        {
            name: "ADM21JF014 Java FSD",
            startedOn: "10-Sep-2021",
            status: "completed",
            coach: "Kalyani",
            trainer: "Rakesh"
        },

        {
            name: "CDBJF21025 Java FSD",
            startedOn: "24-Dec-2021",
            status: "ongoing",
            coach: "Rahul",
            trainer: "Suresh"
        }

    ];

    return (

        <div>

            <h1 style={{ textAlign: "center" }}>
                Cohorts Details
            </h1>

            {
                cohorts.map((cohort, index) => (

                    <CohortDetails
                        key={index}
                        cohort={cohort}
                    />

                ))
            }

        </div>

    );

}

export default App;