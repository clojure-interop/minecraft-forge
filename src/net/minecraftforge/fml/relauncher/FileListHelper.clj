(ns net.minecraftforge.fml.relauncher.FileListHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.relauncher FileListHelper]))

(defn ->file-list-helper
  "Constructor."
  (^FileListHelper []
    (new FileListHelper )))

(defn *sort-file-list
  "dir - `java.io.File`
  filter - `java.io.FilenameFilter`

  returns: `java.io.File[]`"
  ([^java.io.File dir ^java.io.FilenameFilter filter]
    (FileListHelper/sortFileList dir filter))
  ([files]
    (FileListHelper/sortFileList files)))

