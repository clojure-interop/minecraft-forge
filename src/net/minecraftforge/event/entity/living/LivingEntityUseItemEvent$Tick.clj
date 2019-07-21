(ns net.minecraftforge.event.entity.living.LivingEntityUseItemEvent$Tick
  "Fired every tick that a player is 'using' an item, see LivingEntityUseItemEvent.Start for info.

  Cancel the event, or set the duration or <= 0 to cause the player to stop using the item."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.living LivingEntityUseItemEvent$Tick]))

(defn ->tick
  "Constructor.

  entity - `net.minecraft.entity.EntityLivingBase`
  item - `net.minecraft.item.ItemStack`
  duration - `int`"
  (^LivingEntityUseItemEvent$Tick [^net.minecraft.entity.EntityLivingBase entity ^net.minecraft.item.ItemStack item ^Integer duration]
    (new LivingEntityUseItemEvent$Tick entity item duration)))

