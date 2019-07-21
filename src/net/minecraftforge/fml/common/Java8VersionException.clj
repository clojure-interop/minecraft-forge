(ns net.minecraftforge.fml.common.Java8VersionException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common Java8VersionException]))

(defn ->java-8-version-exception
  "Constructor.

  mods - `java.util.List`"
  (^Java8VersionException [^java.util.List mods]
    (new Java8VersionException mods)))

(defn get-mods
  "returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^Java8VersionException this]
    (-> this (.getMods))))

