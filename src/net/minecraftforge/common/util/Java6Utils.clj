(ns net.minecraftforge.common.util.Java6Utils
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util Java6Utils]))

(defn ->java-6-utils
  "Constructor."
  (^Java6Utils []
    (new Java6Utils )))

(defn *close-zip-quietly
  "ZipFile does not implement Closeable on Java 6.
   This method is the same as IOUtils.closeQuietly(Closeable) but works on ZipFile on Java 6.

  file - `java.util.zip.ZipFile`"
  ([^java.util.zip.ZipFile file]
    (Java6Utils/closeZipQuietly file)))

