(ns net.minecraftforge.fml.common.ZipperUtil
  "Copied from http://stackoverflow.com/questions/1399126/java-util-zip-recreating-directory-structure
  because the code looked very tidy and neat. Thanks, McDowell!"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ZipperUtil]))

(defn ->zipper-util
  "Constructor."
  (^ZipperUtil []
    (new ZipperUtil )))

(defn *zip
  "directory - `java.io.File`
  zipfile - `java.io.File`

  throws: java.io.IOException"
  ([^java.io.File directory ^java.io.File zipfile]
    (ZipperUtil/zip directory zipfile)))

(defn *backup-world
  "dir-name - `java.lang.String`

  throws: java.io.IOException"
  ([^java.lang.String dir-name]
    (ZipperUtil/backupWorld dir-name))
  ([]
    (ZipperUtil/backupWorld ))
  ([^java.lang.String dir-name ^java.lang.String save-name]
    (ZipperUtil/backupWorld dir-name save-name)))

