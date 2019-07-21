(ns net.minecraftforge.event.entity.player.UseHoeEvent
  "This event is fired when a player attempts to use a Hoe on a block, it
  can be canceled to completely prevent any further processing.

  You can also set the result to ALLOW to mark the event as processed
  and damage the hoe.

  setResult(ALLOW) is the same as the old setHandled();"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player UseHoeEvent]))

(defn ->use-hoe-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  current - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`"
  (^UseHoeEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack current ^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos]
    (new UseHoeEvent player current world pos)))

(defn get-current
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^UseHoeEvent this]
    (-> this (.getCurrent))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^UseHoeEvent this]
    (-> this (.getWorld))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^UseHoeEvent this]
    (-> this (.getPos))))

