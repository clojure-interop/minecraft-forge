(ns net.minecraftforge.client.event.RenderLivingEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderLivingEvent]))

(defn ->render-living-event
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  renderer - `net.minecraft.client.renderer.entity.RenderLivingBase`
  x - `double`
  y - `double`
  z - `double`"
  (^RenderLivingEvent [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.client.renderer.entity.RenderLivingBase renderer ^Double x ^Double y ^Double z]
    (new RenderLivingEvent entity renderer x y z)))

(defn get-entity
  "returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^RenderLivingEvent this]
    (-> this (.getEntity))))

(defn get-renderer
  "returns: `net.minecraft.client.renderer.entity.RenderLivingBase<T>`"
  (^net.minecraft.client.renderer.entity.RenderLivingBase [^RenderLivingEvent this]
    (-> this (.getRenderer))))

(defn get-x
  "returns: `double`"
  (^Double [^RenderLivingEvent this]
    (-> this (.getX))))

(defn get-y
  "returns: `double`"
  (^Double [^RenderLivingEvent this]
    (-> this (.getY))))

(defn get-z
  "returns: `double`"
  (^Double [^RenderLivingEvent this]
    (-> this (.getZ))))

