// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCogsmithBoots extends ModelBase {
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightLeg_r1;
	private final ModelRenderer RightBoot;
	private final ModelRenderer RightLeg_r2;

	public WFMModelCogsmithBoots() {
		textureWidth = 64;
		textureHeight = 64;

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.cubeList.add(new ModelBox(LeftBoot, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.9F, true));

		RightLeg_r1 = new ModelRenderer(this);
		RightLeg_r1.setRotationPoint(0.0F, 11.5F, -4.0F);
		LeftBoot.addChild(RightLeg_r1);
		setRotationAngle(RightLeg_r1, 0.0873F, 0.0F, 0.0F);
		RightLeg_r1.cubeList.add(new ModelBox(RightLeg_r1, 0, 32, -2.5F, -1.0F, 0.0F, 5, 2, 1, 0.4F, true));

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.cubeList.add(new ModelBox(RightBoot, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.9F, false));

		RightLeg_r2 = new ModelRenderer(this);
		RightLeg_r2.setRotationPoint(0.0F, 11.5F, -4.0F);
		RightBoot.addChild(RightLeg_r2);
		setRotationAngle(RightLeg_r2, 0.0873F, 0.0F, 0.0F);
		RightLeg_r2.cubeList.add(new ModelBox(RightLeg_r2, 0, 32, -2.5F, -1.0F, 0.0F, 5, 2, 1, 0.4F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LeftBoot.render(f5);
		RightBoot.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}