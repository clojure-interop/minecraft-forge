(ns net.minecraftforge.fml.common.CertificateHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common CertificateHelper]))

(defn ->certificate-helper
  "Constructor."
  (^CertificateHelper []
    (new CertificateHelper )))

(defn *get-fingerprint
  "certificate - `java.security.cert.Certificate`

  returns: `java.lang.String`"
  (^java.lang.String [^java.security.cert.Certificate certificate]
    (CertificateHelper/getFingerprint certificate)))

