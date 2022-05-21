const products = axios
  .get("http://localhost:8081/getAllProducts")
  .catch((error) => {
    console.log({ error });
    // Handle error
  });

const setup = function () {
  ReactDOM.render(
    <ProductCatalog products={products}></ProductCatalog>,
    document.getElementById("product-catalog")
  );
};

// Call our setup function
setup();
