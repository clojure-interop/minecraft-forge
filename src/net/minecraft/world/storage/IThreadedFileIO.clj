(ns net.minecraft.world.storage.IThreadedFileIO
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.storage IThreadedFileIO]))

(defn write-next-io
  "returns: `boolean`"
  (^Boolean [^IThreadedFileIO this]
    (-> this (.writeNextIO))))

