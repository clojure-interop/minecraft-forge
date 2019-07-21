(ns net.minecraftforge.fml.client.ExtendedServerListData
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client ExtendedServerListData]))

(defn ->extended-server-list-data
  "Constructor.

  type - `java.lang.String`
  is-compatible - `boolean`
  mod-data - `java.util.Map`
  is-blocked - `boolean`"
  (^ExtendedServerListData [^java.lang.String type ^Boolean is-compatible ^java.util.Map mod-data ^Boolean is-blocked]
    (new ExtendedServerListData type is-compatible mod-data is-blocked)))

(defn type
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^ExtendedServerListData this]
    (-> this .-type)))

(defn is-compatible
  "Instance Constant.

  type: boolean"
  (^Boolean [^ExtendedServerListData this]
    (-> this .-isCompatible)))

(defn mod-data
  "Instance Constant.

  type: java.util.Map<java.lang.String,java.lang.String>"
  (^java.util.Map [^ExtendedServerListData this]
    (-> this .-modData)))

(defn is-blocked
  "Instance Constant.

  type: boolean"
  (^Boolean [^ExtendedServerListData this]
    (-> this .-isBlocked)))

