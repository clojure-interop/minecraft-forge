(ns net.minecraftforge.fml.common.DuplicateModsFoundException
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common DuplicateModsFoundException]))

(defn ->duplicate-mods-found-exception
  "Constructor.

  dupes - `com.google.common.collect.SetMultimap`"
  (^DuplicateModsFoundException [^com.google.common.collect.SetMultimap dupes]
    (new DuplicateModsFoundException dupes)))

(defn dupes
  "Instance Field.

  type: com.google.common.collect.SetMultimap<net.minecraftforge.fml.common.ModContainer,java.io.File>"
  (^com.google.common.collect.SetMultimap [^DuplicateModsFoundException this]
    (-> this .-dupes)))

