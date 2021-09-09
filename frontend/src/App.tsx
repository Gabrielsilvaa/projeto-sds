import Footer from "components/Footer";
import NavBar from "components/NavBar";
import DataTable from "components/DataTable";

function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className="container">
        <h1 className="text-primary">Salve quebrada</h1>
        <DataTable></DataTable>
      </div>
      <Footer></Footer>
    </>
  );
}

export default App;
