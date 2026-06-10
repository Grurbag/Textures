// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCandles extends ModelBase {
	private final ModelRenderer candle1;
	private final ModelRenderer candlewick1;
	private final ModelRenderer candle2;
	private final ModelRenderer candlewick2;
	private final ModelRenderer candle3;
	private final ModelRenderer candlewick3;

	public WFMModelCandles() {
		textureWidth = 64;
		textureHeight = 32;

		candle1 = new ModelRenderer(this);
		candle1.setRotationPoint(0.0F, 24.0F, 0.0F);
		candle1.cubeList.add(new ModelBox(candle1, 0, 0, -3.0F, -13.0F, 0.0F, 3, 13, 3, 0.0F, false));

		candlewick1 = new ModelRenderer(this);
		candlewick1.setRotationPoint(0.0F, -4.0F, -1.0F);
		candle1.addChild(candlewick1);
		candlewick1.cubeList.add(new ModelBox(candlewick1, 0, 17, -1.5F, -12.0F, 2.0F, 0, 3, 1, 0.0F, false));

		candle2 = new ModelRenderer(this);
		candle2.setRotationPoint(3.0F, 24.0F, -1.0F);
		candle2.cubeList.add(new ModelBox(candle2, 13, 0, -3.0F, -6.0F, 0.0F, 3, 6, 3, 0.0F, false));

		candlewick2 = new ModelRenderer(this);
		candlewick2.setRotationPoint(0.0F, 3.0F, -3.0F);
		candle2.addChild(candlewick2);
		candlewick2.cubeList.add(new ModelBox(candlewick2, 0, 17, -1.5F, -12.0F, 4.0F, 0, 3, 1, 0.0F, false));

		candle3 = new ModelRenderer(this);
		candle3.setRotationPoint(-1.0F, 24.0F, -3.0F);
		candle3.cubeList.add(new ModelBox(candle3, 27, 0, -3.0F, -8.0F, 0.0F, 3, 8, 3, 0.0F, false));

		candlewick3 = new ModelRenderer(this);
		candlewick3.setRotationPoint(0.0F, 1.0F, -1.0F);
		candle3.addChild(candlewick3);
		candlewick3.cubeList.add(new ModelBox(candlewick3, 0, 17, -1.5F, -12.0F, 2.0F, 0, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		candle1.render(f5);
		candle2.render(f5);
		candle3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}