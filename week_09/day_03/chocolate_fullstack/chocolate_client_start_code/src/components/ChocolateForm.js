import {useState} from 'react';
const ChocolateForm = ({estates, postChocolate}) => {


    // const [stateChocolate, setStateChocolate] = useState({
    //     name: "",
    //     cocoaPercentage: 0,
    //     estate: null
    // })

    const [name, setName] = useState('')
    const [cocoaPercentage, setCocoaPercentage] = useState(0);
    const [estate, setEstate] = useState(null);

    const estateOptions = estates.map(estate => {
        return (
            <option key={estate.id} value={estate.id}>{estate.name}
            </option>
        ) 
    })

    const handleFormSubmit = () => {}

return (
    <form onSubmit={handleFormSubmit}>
        <h2>Create a Chocolate</h2>
        <input type="text"
       placeholder="Chocolate name"
       value={name}
       onChange={(e) => setName(e.target.value)}
       />

<input type="text"
       placeholder="Cocoa percentage"
       value={cocoaPercentage}
       onChange={(e) => setCocoaPercentage(e.target.value)}
       />

       <select
        value={estate}
        onChange={handleEstateChange}
        defaultValue="select-estate">
            <opton disabled-value="select-estate"> Select an estate</opton>
            {estateOptions}
        </select>
    </form>
);
};

export default ChocolateForm; 