(ns net.minecraftforge.event.world.ExplosionEvent$Detonate
  "ExplosionEvent.Detonate is fired once the explosion has a list of affected blocks and entities.  These lists can be modified to change the outcome.

  This event is not Cancelable.
  This event does not use HasResult.
  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world ExplosionEvent$Detonate]))

(defn ->detonate
  "Constructor.

  world - `net.minecraft.world.World`
  explosion - `net.minecraft.world.Explosion`
  entity-list - `java.util.List`"
  (^ExplosionEvent$Detonate [^net.minecraft.world.World world ^net.minecraft.world.Explosion explosion ^java.util.List entity-list]
    (new ExplosionEvent$Detonate world explosion entity-list)))

(defn get-affected-blocks
  "return the list of blocks affected by the explosion.

  returns: `java.util.List<net.minecraft.util.math.BlockPos>`"
  (^java.util.List [^ExplosionEvent$Detonate this]
    (-> this (.getAffectedBlocks))))

(defn get-affected-entities
  "return the list of entities affected by the explosion.

  returns: `java.util.List<net.minecraft.entity.Entity>`"
  (^java.util.List [^ExplosionEvent$Detonate this]
    (-> this (.getAffectedEntities))))

