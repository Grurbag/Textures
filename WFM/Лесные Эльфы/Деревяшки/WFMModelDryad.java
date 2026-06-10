// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelDryad extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer boobs;
	private final ModelRenderer cape;
	private final ModelRenderer leg_right;
	private final ModelRenderer leg_right2;
	private final ModelRenderer leg_left;
	private final ModelRenderer leg_left2;
	private final ModelRenderer hand_right;
	private final ModelRenderer hand_right2;
	private final ModelRenderer hand_right3;
	private final ModelRenderer hand_left;
	private final ModelRenderer hand_left2;
	private final ModelRenderer hand_left3;
	private final ModelRenderer head;
	private final ModelRenderer head2;
	private final ModelRenderer head3;

	public WFMModelDryad() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, -1.0F);
		setRotationAngle(body, 0.1745F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -4.0F, -8.0F, -1.0F, 8, 12, 4, 0.0F, false));

		boobs = new ModelRenderer(this);
		boobs.setRotationPoint(-1.0F, -4.0F, -1.0F);
		body.addChild(boobs);
		boobs.cubeList.add(new ModelBox(boobs, 25, 0, -2.0F, -2.0F, -1.0F, 6, 3, 2, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(-1.0F, 5.0F, -1.0F);
		body.addChild(cape);
		setRotationAngle(cape, -0.2618F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 41, 0, -3.0F, -3.0F, -1.0F, 8, 7, 0, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-2.0F, 7.0F, 2.0F);
		setRotationAngle(leg_right, -0.5236F, 0.0F, 0.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 0, 16, -2.1F, 1.5981F, -2.2321F, 3, 7, 4, 0.0F, false));

		leg_right2 = new ModelRenderer(this);
		leg_right2.setRotationPoint(1.0F, 6.134F, -1.2321F);
		leg_right.addChild(leg_right2);
		setRotationAngle(leg_right2, 0.7854F, 0.0F, 0.0F);
		leg_right2.cubeList.add(new ModelBox(leg_right2, 0, 29, -3.5F, 0.8637F, -1.5353F, 3, 12, 3, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(2.0F, 7.0F, 2.0F);
		setRotationAngle(leg_left, -0.5236F, 0.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 0, 16, -0.9F, 1.5981F, -2.2321F, 3, 7, 4, 0.0F, false));

		leg_left2 = new ModelRenderer(this);
		leg_left2.setRotationPoint(3.0F, 6.134F, -1.2321F);
		leg_left.addChild(leg_left2);
		setRotationAngle(leg_left2, 0.7854F, 0.0F, 0.0F);
		leg_left2.cubeList.add(new ModelBox(leg_left2, 0, 29, -3.5F, 0.8637F, -1.5353F, 3, 12, 3, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-5.0F, 1.0F, -1.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 27, 8, -2.0F, -2.0F, -2.0F, 3, 7, 3, 0.0F, false));

		hand_right2 = new ModelRenderer(this);
		hand_right2.setRotationPoint(0.0F, 7.0F, -1.0F);
		hand_right.addChild(hand_right2);
		setRotationAngle(hand_right2, -0.4363F, 0.0F, 0.0F);
		hand_right2.cubeList.add(new ModelBox(hand_right2, 27, 19, -1.5F, -3.0F, -1.5F, 2, 9, 2, 0.0F, false));

		hand_right3 = new ModelRenderer(this);
		hand_right3.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_right2.addChild(hand_right3);
		setRotationAngle(hand_right3, -0.4363F, 0.0F, 0.0F);
		hand_right3.cubeList.add(new ModelBox(hand_right3, 40, 38, -0.5F, 3.0F, -3.5F, 0, 14, 12, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, 1.0F, -1.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 27, 8, -1.0F, -2.0F, -2.0F, 3, 7, 3, 0.0F, false));

		hand_left2 = new ModelRenderer(this);
		hand_left2.setRotationPoint(1.0F, 7.0F, -1.0F);
		hand_left.addChild(hand_left2);
		setRotationAngle(hand_left2, -0.4363F, 0.0F, 0.0F);
		hand_left2.cubeList.add(new ModelBox(hand_left2, 27, 19, -1.5F, -3.0F, -1.5F, 2, 9, 2, 0.0F, false));

		hand_left3 = new ModelRenderer(this);
		hand_left3.setRotationPoint(0.0F, 0.0F, 0.0F);
		hand_left2.addChild(hand_left3);
		setRotationAngle(hand_left3, -0.4363F, 0.0F, 0.0F);
		hand_left3.cubeList.add(new ModelBox(hand_left3, 40, 38, -0.5F, 3.0F, -3.5F, 0, 14, 12, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, -2.0F);
		head.cubeList.add(new ModelBox(head, 0, 48, -4.0F, -7.5F, -5.0F, 8, 8, 8, -1.0F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(4.0F, 6.0F, -3.0F);
		head.addChild(head2);
		head2.cubeList.add(new ModelBox(head2, 25, 47, -8.0F, -8.0F, -2.0F, 8, 4, 0, -1.0F, false));

		head3 = new ModelRenderer(this);
		head3.setRotationPoint(0.0F, -7.0F, 0.0F);
		head.addChild(head3);
		setRotationAngle(head3, -0.8727F, 0.0F, 0.0F);
		head3.cubeList.add(new ModelBox(head3, 36, 23, -7.0F, -8.5F, 0.0F, 14, 13, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leg_right.render(f5);
		leg_left.render(f5);
		hand_right.render(f5);
		hand_left.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}