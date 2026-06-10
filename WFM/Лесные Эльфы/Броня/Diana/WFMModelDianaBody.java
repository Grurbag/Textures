// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelDianaBody extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_left;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer body5;
	private final ModelRenderer body6;
	private final ModelRenderer RightLeg;
	private final ModelRenderer body2;
	private final ModelRenderer body3;
	private final ModelRenderer body4;

	public WFMModelDianaBody() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-5.0F, 2.0F, 0.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 40, 32, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.cubeList.add(new ModelBox(LeftLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, true));

		body5 = new ModelRenderer(this);
		body5.setRotationPoint(3.1F, 2.0F, 1.0F);
		LeftLeg.addChild(body5);
		setRotationAngle(body5, 0.0F, 0.0F, 1.0908F);
		body5.cubeList.add(new ModelBox(body5, 26, 0, -5.0F, 0.0F, -7.0F, 8, 0, 10, 0.0F, false));

		body6 = new ModelRenderer(this);
		body6.setRotationPoint(4.1F, 6.0F, 2.0F);
		LeftLeg.addChild(body6);
		setRotationAngle(body6, 0.0F, 0.0F, -1.8326F);
		body6.cubeList.add(new ModelBox(body6, -9, 8, -6.0F, 0.0F, -7.0F, 10, 0, 9, 0.0F, false));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.25F, true));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(1.9F, 0.0F, 4.0F);
		RightLeg.addChild(body2);
		setRotationAngle(body2, -0.5236F, 0.0F, 0.0F);
		body2.cubeList.add(new ModelBox(body2, -10, 40, -5.0F, 0.5F, -6.866F, 10, 0, 10, 0.0F, false));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(-4.1F, 6.0F, 2.0F);
		RightLeg.addChild(body3);
		setRotationAngle(body3, 0.0F, 0.0F, -1.309F);
		body3.cubeList.add(new ModelBox(body3, -8, 0, -6.0F, 0.0F, -7.0F, 15, 0, 8, 0.0F, false));

		body4 = new ModelRenderer(this);
		body4.setRotationPoint(-1.1F, 6.0F, 5.0F);
		RightLeg.addChild(body4);
		setRotationAngle(body4, -1.2217F, 0.0F, -1.309F);
		body4.cubeList.add(new ModelBox(body4, -8, 32, -7.0F, 0.9397F, -3.442F, 12, 0, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		hand_right.render(f5);
		hand_left.render(f5);
		LeftLeg.render(f5);
		RightLeg.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}