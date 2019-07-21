(ns net.minecraft.world.gen.structure.template.ITemplateProcessor
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure.template ITemplateProcessor]))

(defn process-block
  "world-in - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  block-info-in - `net.minecraft.world.gen.structure.template.Template$BlockInfo`

  returns: `net.minecraft.world.gen.structure.template.Template$BlockInfo`"
  (^net.minecraft.world.gen.structure.template.Template$BlockInfo [^ITemplateProcessor this ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos ^net.minecraft.world.gen.structure.template.Template$BlockInfo block-info-in]
    (-> this (.processBlock world-in pos block-info-in))))

