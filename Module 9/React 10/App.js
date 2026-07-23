import React from "react";

function App() {

    // Office Object
    const office = {
        Name: "Smart Workspaces",
        Rent: 55000,
        Address: "Chennai, Tamil Nadu"
    };

    // List of Office Objects
    const officeList = [

        {
            Name: "Smart Workspaces",
            Rent: 55000,
            Address: "Chennai"
        },

        {
            Name: "Tech Park Offices",
            Rent: 75000,
            Address: "Bangalore"
        },

        {
            Name: "Business Hub",
            Rent: 45000,
            Address: "Hyderabad"
        },

        {
            Name: "Corporate Towers",
            Rent: 90000,
            Address: "Mumbai"
        }

    ];

    return (

        <div style={{ padding: "20px", fontFamily: "Arial" }}>

            <h1>Office Space Rental App</h1>

            {/* Office Image */}

            <img
                src="/office.jpg"
                alt="Office Space"
                width="450"
                height="250"
            />

            <h2>Featured Office</h2>

            <p>
                <strong>Name :</strong> {office.Name}
            </p>

            <p
                style={{
                    color: office.Rent < 60000 ? "red" : "green"
                }}
            >
                <strong>Rent :</strong> ₹{office.Rent}
            </p>

            <p>
                <strong>Address :</strong> {office.Address}
            </p>

            <hr />

            <h2>Available Office Spaces</h2>

            {

                officeList.map((item, index) => (

                    <div
                        key={index}
                        style={{
                            border: "1px solid black",
                            padding: "15px",
                            marginBottom: "15px",
                            borderRadius: "8px"
                        }}
                    >

                        <h3>{item.Name}</h3>

                        <p
                            style={{
                                color: item.Rent < 60000 ? "red" : "green"
                            }}
                        >
                            <strong>Rent :</strong> ₹{item.Rent}
                        </p>

                        <p>
                            <strong>Address :</strong> {item.Address}
                        </p>

                    </div>

                ))

            }

        </div>

    );

}

export default App;