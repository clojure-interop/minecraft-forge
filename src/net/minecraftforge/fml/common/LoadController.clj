(ns net.minecraftforge.fml.common.LoadController
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common LoadController]))

(defn ->load-controller
  "Constructor.

  loader - `net.minecraftforge.fml.common.Loader`"
  (^LoadController [^net.minecraftforge.fml.common.Loader loader]
    (new LoadController loader)))

(defn print-mod-states
  "ret - `java.lang.StringBuilder`"
  ([^LoadController this ^java.lang.StringBuilder ret]
    (-> this (.printModStates ret))))

(defn get-mod-object-list
  "returns: `com.google.common.collect.BiMap<net.minecraftforge.fml.common.ModContainer,java.lang.Object>`"
  (^com.google.common.collect.BiMap [^LoadController this]
    (-> this (.getModObjectList))))

(defn build-mod-list
  "event - `net.minecraftforge.fml.common.event.FMLLoadEvent`"
  ([^LoadController this ^net.minecraftforge.fml.common.event.FMLLoadEvent event]
    (-> this (.buildModList event))))

(defn in-state?
  "state - `net.minecraftforge.fml.common.LoaderState`

  returns: `boolean`"
  (^Boolean [^LoadController this ^net.minecraftforge.fml.common.LoaderState state]
    (-> this (.isInState state))))

(defn build-mod-object-list
  "returns: `com.google.common.collect.ImmutableBiMap<net.minecraftforge.fml.common.ModContainer,java.lang.Object>`"
  (^com.google.common.collect.ImmutableBiMap [^LoadController this]
    (-> this (.buildModObjectList))))

(defn active-container
  "returns: `net.minecraftforge.fml.common.ModContainer`"
  (^net.minecraftforge.fml.common.ModContainer [^LoadController this]
    (-> this (.activeContainer))))

(defn get-mod-state
  "selected-mod - `net.minecraftforge.fml.common.ModContainer`

  returns: `net.minecraftforge.fml.common.LoaderState$ModState`"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^LoadController this ^net.minecraftforge.fml.common.ModContainer selected-mod]
    (-> this (.getModState selected-mod))))

(defn propogate-state-message
  "state-event - `net.minecraftforge.fml.common.event.FMLEvent`"
  ([^LoadController this ^net.minecraftforge.fml.common.event.FMLEvent state-event]
    (-> this (.propogateStateMessage state-event))))

(defn get-active-mod-list
  "returns: `java.util.List<net.minecraftforge.fml.common.ModContainer>`"
  (^java.util.List [^LoadController this]
    (-> this (.getActiveModList))))

(defn transition
  "desired-state - `net.minecraftforge.fml.common.LoaderState`
  force-state - `boolean`"
  ([^LoadController this ^net.minecraftforge.fml.common.LoaderState desired-state ^Boolean force-state]
    (-> this (.transition desired-state force-state))))

(defn error-occurred
  "mod-container - `net.minecraftforge.fml.common.ModContainer`
  exception - `java.lang.Throwable`"
  ([^LoadController this ^net.minecraftforge.fml.common.ModContainer mod-container ^java.lang.Throwable exception]
    (-> this (.errorOccurred mod-container exception))))

(defn distribute-state-message
  "state - `net.minecraftforge.fml.common.LoaderState`
  event-data - `java.lang.Object`"
  ([^LoadController this ^net.minecraftforge.fml.common.LoaderState state ^java.lang.Object event-data]
    (-> this (.distributeStateMessage state event-data)))
  ([^LoadController this ^java.lang.Class custom-event]
    (-> this (.distributeStateMessage custom-event))))

