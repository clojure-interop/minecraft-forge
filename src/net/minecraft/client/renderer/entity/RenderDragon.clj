(ns net.minecraft.client.renderer.entity.RenderDragon
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.entity RenderDragon]))

(defn ->render-dragon
  "Constructor.

  render-manager-in - `net.minecraft.client.renderer.entity.RenderManager`"
  (^RenderDragon [^net.minecraft.client.renderer.entity.RenderManager render-manager-in]
    (new RenderDragon render-manager-in)))

(def *-endercrystal-beam-textures
  "Static Constant.

  type: net.minecraft.util.ResourceLocation"
  RenderDragon/ENDERCRYSTAL_BEAM_TEXTURES)

(defn *render-crystal-beams
  "p-188325-0 - `double`
  p-188325-2 - `double`
  p-188325-4 - `double`
  p-188325-6 - `float`
  p-188325-7 - `double`
  p-188325-9 - `double`
  p-188325-11 - `double`
  p-188325-13 - `int`
  p-188325-14 - `double`
  p-188325-16 - `double`
  p-188325-18 - `double`"
  ([^Double p-188325-0 ^Double p-188325-2 ^Double p-188325-4 ^Float p-188325-6 ^Double p-188325-7 ^Double p-188325-9 ^Double p-188325-11 ^Integer p-188325-13 ^Double p-188325-14 ^Double p-188325-16 ^Double p-188325-18]
    (RenderDragon/renderCrystalBeams p-188325-0 p-188325-2 p-188325-4 p-188325-6 p-188325-7 p-188325-9 p-188325-11 p-188325-13 p-188325-14 p-188325-16 p-188325-18)))

(defn do-render
  "entity - `net.minecraft.entity.boss.EntityDragon`
  x - `double`
  y - `double`
  z - `double`
  entity-yaw - `float`
  partial-ticks - `float`"
  ([^RenderDragon this ^net.minecraft.entity.boss.EntityDragon entity ^Double x ^Double y ^Double z ^Float entity-yaw ^Float partial-ticks]
    (-> this (.doRender entity x y z entity-yaw partial-ticks))))

