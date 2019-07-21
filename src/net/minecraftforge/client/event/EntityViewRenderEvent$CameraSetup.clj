(ns net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup
  "Event that allows mods to alter the angles of the player's camera. Mainly useful for applying roll."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event EntityViewRenderEvent$CameraSetup]))

(defn ->camera-setup
  "Constructor.

  renderer - `net.minecraft.client.renderer.EntityRenderer`
  entity - `net.minecraft.entity.Entity`
  state - `net.minecraft.block.state.IBlockState`
  render-partial-ticks - `double`
  yaw - `float`
  pitch - `float`
  roll - `float`"
  (^EntityViewRenderEvent$CameraSetup [^net.minecraft.client.renderer.EntityRenderer renderer ^net.minecraft.entity.Entity entity ^net.minecraft.block.state.IBlockState state ^Double render-partial-ticks ^Float yaw ^Float pitch ^Float roll]
    (new EntityViewRenderEvent$CameraSetup renderer entity state render-partial-ticks yaw pitch roll)))

(defn get-yaw
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$CameraSetup this]
    (-> this (.getYaw))))

(defn set-yaw
  "yaw - `float`"
  ([^EntityViewRenderEvent$CameraSetup this ^Float yaw]
    (-> this (.setYaw yaw))))

(defn get-pitch
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$CameraSetup this]
    (-> this (.getPitch))))

(defn set-pitch
  "pitch - `float`"
  ([^EntityViewRenderEvent$CameraSetup this ^Float pitch]
    (-> this (.setPitch pitch))))

(defn get-roll
  "returns: `float`"
  (^Float [^EntityViewRenderEvent$CameraSetup this]
    (-> this (.getRoll))))

(defn set-roll
  "roll - `float`"
  ([^EntityViewRenderEvent$CameraSetup this ^Float roll]
    (-> this (.setRoll roll))))

