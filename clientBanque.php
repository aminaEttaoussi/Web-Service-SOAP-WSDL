<?php
$wsdl = "http://localhost:8085/?wsdl";

try {
    $client = new SoapClient($wsdl);

    $result = $client->conversionED(['montant' => 100]);
    echo "100 Euro = " . $result->return . " DH<br>";

    // ✅ Correction ici : accéder à ->return
    $compte = $client->getCompte()->return;
    echo "Compte ID: " . $compte->code . ", Solde: " . $compte->solde . "<br>";

    $comptes = $client->listCompte()->return;
    echo "Liste des comptes :<br>";
    foreach ($comptes as $c) {
        echo "ID: " . $c->code . ", Solde: " . $c->solde . "<br>";
    }

} catch (SoapFault $e) {
    echo "Erreur SOAP : " . $e->getMessage();
}
?>
