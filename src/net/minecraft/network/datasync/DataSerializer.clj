(ns net.minecraft.network.datasync.DataSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.network.datasync DataSerializer]))

(defn write
  "buf - `net.minecraft.network.PacketBuffer`
  value - `T`"
  ([^DataSerializer this ^net.minecraft.network.PacketBuffer buf value]
    (-> this (.write buf value))))

(defn read
  "buf - `net.minecraft.network.PacketBuffer`

  returns: `T`

  throws: java.io.IOException"
  ([^DataSerializer this ^net.minecraft.network.PacketBuffer buf]
    (-> this (.read buf))))

(defn create-key
  "id - `int`

  returns: `net.minecraft.network.datasync.DataParameter<T>`"
  (^net.minecraft.network.datasync.DataParameter [^DataSerializer this ^Integer id]
    (-> this (.createKey id))))

