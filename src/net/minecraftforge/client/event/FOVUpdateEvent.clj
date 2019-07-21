(ns net.minecraftforge.client.event.FOVUpdateEvent
  "Author: MachineMuse (Claire Semple)
  Created: 6:07 PM, 9/5/13"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event FOVUpdateEvent]))

(defn ->fov-update-event
  "Constructor.

  entity - `net.minecraft.entity.player.EntityPlayer`
  fov - `float`"
  (^FOVUpdateEvent [^net.minecraft.entity.player.EntityPlayer entity ^Float fov]
    (new FOVUpdateEvent entity fov)))

(defn get-entity
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^FOVUpdateEvent this]
    (-> this (.getEntity))))

(defn get-fov
  "returns: `float`"
  (^Float [^FOVUpdateEvent this]
    (-> this (.getFov))))

(defn get-newfov
  "returns: `float`"
  (^Float [^FOVUpdateEvent this]
    (-> this (.getNewfov))))

(defn set-newfov
  "newfov - `float`"
  ([^FOVUpdateEvent this ^Float newfov]
    (-> this (.setNewfov newfov))))

