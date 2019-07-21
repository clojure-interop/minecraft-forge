(ns net.minecraft.client.renderer.entity.RenderBoat
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderBoat]))

(defn ->render-boat
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderBoat [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderBoat render-manager-in)))

(defn do-render
  "entity - `net.minecraft.entity.item.EntityBoat`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderBoat this ^net.minecraft.entity.item.EntityBoat entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

(defn setup-rotation
  "p-188311-1 - `net.minecraft.entity.item.EntityBoat`
  p-188311-2 - `float`
  p-188311-3 - `float`"
  ([^RenderBoat this ^net.minecraft.entity.item.EntityBoat p-188311-1 ^Float p-188311-2 ^Float p-188311-3]
    (-> this (.setupRotation p-188311-1 p-188311-2 p-188311-3))))

(defn setup-translation
  "p-188309-1 - `double`
  p-188309-3 - `double`
  p-188309-5 - `double`"
  ([^RenderBoat this ^Double p-188309-1 ^Double p-188309-3 ^Double p-188309-5]
    (-> this (.setupTranslation p-188309-1 p-188309-3 p-188309-5))))

(defn multipass?
  "returns: `boolean`"
  (^Boolean [^RenderBoat this]
    (-> this (.isMultipass))))

(defn render-multipass
  "p-188300-1 - `net.minecraft.entity.item.EntityBoat`
  p-188300-2 - `double`
  p-188300-4 - `double`
  p-188300-6 - `double`
  p-188300-8 - `float`
  p-188300-9 - `float`"
  ([^RenderBoat this ^net.minecraft.entity.item.EntityBoat p-188300-1 ^Double p-188300-2 ^Double p-188300-4 ^Double p-188300-6 ^Float p-188300-8 ^Float p-188300-9]
    (-> this (.renderMultipass p-188300-1 p-188300-2 p-188300-4 p-188300-6 p-188300-8 p-188300-9))))

