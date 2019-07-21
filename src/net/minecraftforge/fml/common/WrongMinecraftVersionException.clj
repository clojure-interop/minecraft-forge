(ns net.minecraftforge.fml.common.WrongMinecraftVersionException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common WrongMinecraftVersionException]))

(defn ->wrong-minecraft-version-exception
  "Constructor.

  mod - `net.minecraftforge.fml.common.ModContainer`
  mcver - `java.lang.String`"
  (^WrongMinecraftVersionException [^net.minecraftforge.fml.common.ModContainer mod ^java.lang.String mcver]
    (new WrongMinecraftVersionException mod mcver)))

(defn mod
  "Instance Field.

  type: net.minecraftforge.fml.common.ModContainer"
  (^net.minecraftforge.fml.common.ModContainer [^WrongMinecraftVersionException this]
    (-> this .-mod)))

