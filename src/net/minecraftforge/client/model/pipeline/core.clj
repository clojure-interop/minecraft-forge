(ns net.minecraftforge.client.model.pipeline.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraftforge.client.model.pipeline.BlockInfo])
(require '[net.minecraftforge.client.model.pipeline.ForgeBlockModelRenderer])
(require '[net.minecraftforge.client.model.pipeline.IVertexConsumer])
(require '[net.minecraftforge.client.model.pipeline.IVertexProducer])
(require '[net.minecraftforge.client.model.pipeline.LightUtil$ItemConsumer])
(require '[net.minecraftforge.client.model.pipeline.LightUtil])
(require '[net.minecraftforge.client.model.pipeline.QuadGatheringTransformer])
(require '[net.minecraftforge.client.model.pipeline.TransformerConsumer])
(require '[net.minecraftforge.client.model.pipeline.UnpackedBakedQuad$Builder])
(require '[net.minecraftforge.client.model.pipeline.UnpackedBakedQuad])
(require '[net.minecraftforge.client.model.pipeline.VertexBufferConsumer])
(require '[net.minecraftforge.client.model.pipeline.VertexLighterFlat])
(require '[net.minecraftforge.client.model.pipeline.VertexLighterSmoothAo])
(require '[net.minecraftforge.client.model.pipeline.VertexTransformer])
