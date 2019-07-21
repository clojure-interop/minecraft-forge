(ns net.minecraftforge.fml.common.MissingModsException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common MissingModsException]))

(defn ->missing-mods-exception
  "Constructor.

  missing-mods - `java.util.Set`
  id - `java.lang.String`
  name - `java.lang.String`"
  (^MissingModsException [^java.util.Set missing-mods ^java.lang.String id ^java.lang.String name]
    (new MissingModsException missing-mods id name)))

(defn missing-mods
  "Instance Constant.

  type: java.util.Set<net.minecraftforge.fml.common.versioning.ArtifactVersion>"
  (^java.util.Set [^MissingModsException this]
    (-> this .-missingMods)))

(defn get-mod-name
  "returns: `java.lang.String`"
  (^java.lang.String [^MissingModsException this]
    (-> this (.getModName))))

