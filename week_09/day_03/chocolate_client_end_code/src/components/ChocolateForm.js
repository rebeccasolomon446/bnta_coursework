import { useState } from "react";

const ChocolateForm = ({ estates, postChocolate }) => {
  // const [stateChocolate, setStateChocolate] = useState({
  //     name: "",
  //     cocoaPercentage: 0,
  //     estate: null
  // })

  const [name, setName] = useState("");
  const [cocoaPercentage, setCocoaPercentage] = useState(0);
  const [estate, setEstate] = useState(null);

  const [error, setError] = useState("");

  const estateOptions = estates.map((estate) => {
    return (
      <option key={estate.id} value={estate.id}>
        {estate.name}
      </option>
    );
  });

  const handleEstateChange = (event) => {
    const estateId = parseInt(event.target.value);
    const selectedEstate = estates.find((estate) => estate.id === estateId);
    setEstate(selectedEstate);
  };

  const handleValidation = () => {
    if (name === "") {
      setError("Please enter a name");
      return false;
    }

    if (estate === null) {
      setError("Please select an estate");
      return false;
    }

    setError("");
    return true;
  };

  const handleFormSubmit = (event) => {
    event.preventDefault();
    if (handleValidation() === true) {
      const postBody = {
        name,
        cocoaPercentage,
        estate,
      };
      postChocolate(postBody);
      setName("");
      setCocoaPercentage(0);
      setEstate(null);
    }
  };

  return (
    <form onSubmit={handleFormSubmit}>
      <h2>Create a chocolate</h2>
      <input
        type="text"
        placeholder="Chocolate name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      />

      <input
        type="number"
        placeholder="Cocoa percentage"
        value={cocoaPercentage}
        onChange={(e) => setCocoaPercentage(e.target.value)}
      />

      <select onChange={handleEstateChange} defaultValue="select-estate">
        <option disabled-value="select-estate">Select an estate</option>
        {estateOptions}
      </select>

      <button type="submit">Ok</button>
      <p>{error}</p>
    </form>
  );
};

export default ChocolateForm;
