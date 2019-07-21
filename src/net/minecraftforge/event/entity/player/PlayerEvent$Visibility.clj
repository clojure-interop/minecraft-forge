(ns net.minecraftforge.event.entity.player.PlayerEvent$Visibility
  "Fired when the world checks if a player is near enough to be attacked by an entity.
  The resulting visibility modifier is multiplied by the one calculated by Minecraft (based on sneaking and more) and used to calculate the radius a player has to be in (targetDistance*modifier).
  This can also be used to increase the visibility of a player, if it was decreased by Minecraft or other mods. But the resulting value cannot be higher than the standard target distance."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerEvent$Visibility]))

(defn ->visibility
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`"
  (^PlayerEvent$Visibility [^net.minecraft.entity.player.EntityPlayer player]
    (new PlayerEvent$Visibility player)))

(defn modify-visibility
  "mod - Is multiplied with the current modifier - `double`"
  ([^PlayerEvent$Visibility this ^Double mod]
    (-> this (.modifyVisibility mod))))

(defn get-visibility-modifier
  "returns: The current modifier - `double`"
  (^Double [^PlayerEvent$Visibility this]
    (-> this (.getVisibilityModifier))))

