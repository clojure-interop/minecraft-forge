(ns net.minecraftforge.client.model.b3d.B3DModel$Parser
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DModel$Parser]))

(defn ->parser
  "Constructor.

  in - `java.io.InputStream`

  throws: java.io.IOException"
  (^B3DModel$Parser [^java.io.InputStream in]
    (new B3DModel$Parser in)))

(defn parse
  "returns: `net.minecraftforge.client.model.b3d.B3DModel`

  throws: java.io.IOException"
  (^net.minecraftforge.client.model.b3d.B3DModel [^B3DModel$Parser this]
    (-> this (.parse))))

