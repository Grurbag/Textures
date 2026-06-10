// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelGoidamirBody extends ModelBase {
	private final ModelRenderer bipedBody;
	private final ModelRenderer cape;
	private final ModelRenderer hand_left;
	private final ModelRenderer shoulderLeft;
	private final ModelRenderer shoulderLeft2;
	private final ModelRenderer shoulderLeft3;
	private final ModelRenderer hand_right;
	private final ModelRenderer shoulderRight;
	private final ModelRenderer shoulderRight2;
	private final ModelRenderer shoulderRight3;

	public WFMModelGoidamirBody() {
		textureWidth = 64;
		textureHeight = 64;

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 3.0F);
		bipedBody.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 32, 0, -8.5F, -2.0F, 0.0F, 16, 25, 0, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(8.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 0, 16, -3.0F, -2.0F, -2.1F, 4, 12, 4, 0.5F, true));

		shoulderLeft = new ModelRenderer(this);
		shoulderLeft.setRotationPoint(0.0F, -1.0F, 0.0F);
		hand_left.addChild(shoulderLeft);
		setRotationAngle(shoulderLeft, 0.0F, 0.0F, -0.5236F);
		shoulderLeft.cubeList.add(new ModelBox(shoulderLeft, 0, 32, -0.9F, -2.0F, -3.0F, 3, 3, 6, 0.0F, false));

		shoulderLeft2 = new ModelRenderer(this);
		shoulderLeft2.setRotationPoint(0.0F, 2.0F, 0.0F);
		shoulderLeft.addChild(shoulderLeft2);
		setRotationAngle(shoulderLeft2, 0.0F, 0.0F, 0.3054F);
		shoulderLeft2.cubeList.add(new ModelBox(shoulderLeft2, 0, 32, -1.0F, -2.0F, -3.1F, 3, 3, 6, 0.0F, false));

		shoulderLeft3 = new ModelRenderer(this);
		shoulderLeft3.setRotationPoint(0.0F, 1.0F, 0.0F);
		shoulderLeft2.addChild(shoulderLeft3);
		setRotationAngle(shoulderLeft3, 0.0F, 0.0F, 0.3054F);
		shoulderLeft3.cubeList.add(new ModelBox(shoulderLeft3, 0, 32, -1.0F, -2.0F, -3.0F, 3, 3, 6, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-6.0F, 2.0F, 0.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 16, 16, -3.0F, -2.0F, -2.1F, 4, 12, 4, 0.5F, false));

		shoulderRight = new ModelRenderer(this);
		shoulderRight.setRotationPoint(-2.0F, -1.0F, 0.0F);
		hand_right.addChild(shoulderRight);
		setRotationAngle(shoulderRight, -3.1198F, 0.0378F, -2.6176F);
		shoulderRight.cubeList.add(new ModelBox(shoulderRight, 0, 32, -0.85F, -2.0F, -3.0F, 3, 3, 6, 0.0F, false));

		shoulderRight2 = new ModelRenderer(this);
		shoulderRight2.setRotationPoint(0.0F, 2.0F, 0.0F);
		shoulderRight.addChild(shoulderRight2);
		setRotationAngle(shoulderRight2, 0.0F, 0.0F, 0.3054F);
		shoulderRight2.cubeList.add(new ModelBox(shoulderRight2, 0, 32, -1.0F, -2.0F, -3.1F, 3, 3, 6, 0.0F, false));

		shoulderRight3 = new ModelRenderer(this);
		shoulderRight3.setRotationPoint(0.0F, 1.0F, 0.0F);
		shoulderRight2.addChild(shoulderRight3);
		setRotationAngle(shoulderRight3, 0.0F, 0.0F, 0.3054F);
		shoulderRight3.cubeList.add(new ModelBox(shoulderRight3, 0, 32, -1.0F, -2.0F, -3.0F, 3, 3, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedBody.render(f5);
		hand_left.render(f5);
		hand_right.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}