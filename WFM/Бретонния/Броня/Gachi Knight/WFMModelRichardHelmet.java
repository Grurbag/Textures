// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelRichardHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer wings;
	private final ModelRenderer wings_r1;
	private final ModelRenderer helmet_overlay;

	public WFMModelRichardHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		wings = new ModelRenderer(this);
		wings.setRotationPoint(-6.0F, -1.0F, 2.0F);
		helmet.addChild(wings);
		setRotationAngle(wings, 0.0F, 1.6581F, 0.0F);
		

		wings_r1 = new ModelRenderer(this);
		wings_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		wings.addChild(wings_r1);
		setRotationAngle(wings_r1, 0.0F, -0.0873F, 0.0F);
		wings_r1.cubeList.add(new ModelBox(wings_r1, 0, -14, 1.5F, -23.0F, -1.0F, 0, 19, 14, 0.0F, false));

		helmet_overlay = new ModelRenderer(this);
		helmet_overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet_overlay.cubeList.add(new ModelBox(helmet_overlay, 32, 16, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
		helmet_overlay.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}