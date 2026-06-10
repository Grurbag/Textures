// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCathayAstromancerHelmet extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer bipedHeadWear;
	private final ModelRenderer feater_left;
	private final ModelRenderer feater_right;
	private final ModelRenderer left;
	private final ModelRenderer right;

	public WFMModelCathayAstromancerHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 24.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		bipedHeadWear = new ModelRenderer(this);
		bipedHeadWear.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.addChild(bipedHeadWear);
		bipedHeadWear.cubeList.add(new ModelBox(bipedHeadWear, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		feater_left = new ModelRenderer(this);
		feater_left.setRotationPoint(-1.0F, -8.0F, 0.0F);
		bipedHead.addChild(feater_left);
		setRotationAngle(feater_left, 0.0F, -0.2618F, 0.0F);
		feater_left.cubeList.add(new ModelBox(feater_left, 0, 4, -1.0F, -14.0F, -4.0F, 0, 14, 14, 0.0F, false));

		feater_right = new ModelRenderer(this);
		feater_right.setRotationPoint(3.0F, -8.0F, 0.0F);
		bipedHead.addChild(feater_right);
		setRotationAngle(feater_right, 0.0F, 0.2618F, 0.0F);
		feater_right.cubeList.add(new ModelBox(feater_right, 0, 4, -1.0F, -14.0F, -4.0F, 0, 14, 14, 0.0F, false));

		left = new ModelRenderer(this);
		left.setRotationPoint(-5.5F, -6.0F, 0.5F);
		bipedHead.addChild(left);
		setRotationAngle(left, 0.5672F, 0.0F, 0.5236F);
		left.cubeList.add(new ModelBox(left, 49, 27, -2.5F, 0.0F, -2.5F, 5, 0, 5, 0.0F, false));

		right = new ModelRenderer(this);
		right.setRotationPoint(5.5F, -6.0F, 0.5F);
		bipedHead.addChild(right);
		setRotationAngle(right, 0.5672F, 0.0F, -0.5236F);
		right.cubeList.add(new ModelBox(right, 37, 27, -2.5F, 0.0F, -2.5F, 5, 0, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedHead.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}