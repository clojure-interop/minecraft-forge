(ns net.minecraft.world.storage.ThreadedFileIOBase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage ThreadedFileIOBase]))

(defn *get-threaded-io-instance
  "returns: `net.minecraft.world.storage.ThreadedFileIOBase`"
  (^net.minecraft.world.storage.ThreadedFileIOBase []
    (ThreadedFileIOBase/getThreadedIOInstance )))

(defn run
  ""
  ([^ThreadedFileIOBase this]
    (-> this (.run))))

(defn queue-io
  "file-io - `net.minecraft.world.storage.IThreadedFileIO`"
  ([^ThreadedFileIOBase this ^net.minecraft.world.storage.IThreadedFileIO file-io]
    (-> this (.queueIO file-io))))

(defn wait-for-finish
  "throws: java.lang.InterruptedException"
  ([^ThreadedFileIOBase this]
    (-> this (.waitForFinish))))

