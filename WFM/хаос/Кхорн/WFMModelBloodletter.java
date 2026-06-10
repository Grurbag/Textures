// Made with Blockbench 4.12.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBloodletter extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftArm2;
	private final ModelRenderer leftArm3;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightArm2;
	private final ModelRenderer rightArm3;
	private final ModelRenderer head;
	private final ModelRenderer brov;
	private final ModelRenderer tongue;
	private final ModelRenderer tongue2;
	private final ModelRenderer tongue3;
	private final ModelRenderer tongue4;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;
	private final ModelRenderer horn3;
	private final ModelRenderer horn4;
	private final ModelRenderer horn5;
	private final ModelRenderer hornRight;
	private final ModelRenderer hornRight2;
	private final ModelRenderer hornRight3;
	private final ModelRenderer hornRight4;
	private final ModelRenderer hornRight5;
	private final ModelRenderer brov2;
	private final ModelRenderer leftLeg;
	private final ModelRenderer leftLeg1;
	private final ModelRenderer leftLeg2;
	private final ModelRenderer leftLeg3;
	private final ModelRenderer leftLeg4;
	private final ModelRenderer rightLegClawBig2;
	private final ModelRenderer rightLegClawBig3;
	private final ModelRenderer leftLeg5;
	private final ModelRenderer rightLegClawBig4;
	private final ModelRenderer rightLegClawBig5;
	private final ModelRenderer leftLeg6;
	private final ModelRenderer rightLegClawBig10;
	private final ModelRenderer rightLegClawBig11;
	private final ModelRenderer rightLeg;
	private final ModelRenderer rightLeg1;
	private final ModelRenderer rightLeg2;
	private final ModelRenderer rightLeg3;
	private final ModelRenderer rightLeg4;
	private final ModelRenderer rightLegClawBig6;
	private final ModelRenderer rightLegClawBig7;
	private final ModelRenderer rightLeg5;
	private final ModelRenderer rightLegClawBig8;
	private final ModelRenderer rightLegClawBig9;
	private final ModelRenderer rightLeg6;
	private final ModelRenderer rightLegClawBig12;
	private final ModelRenderer rightLegClawBig13;

	public WFMModelBloodletter() {
		texWidth = 128;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 2.0F, 0.0F);
		body.texOffs(18, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
		body.texOffs(58, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.3F, false);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(4.0F, -2.0F, 0.0F);
		

		leftArm2 = new ModelRenderer(this);
		leftArm2.setPos(0.0F, 0.0F, 0.0F);
		leftArm.addChild(leftArm2);
		setRotationAngle(leftArm2, 0.0F, 0.0F, -0.0873F);
		leftArm2.texOffs(42, 16).addBox(0.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		leftArm3 = new ModelRenderer(this);
		leftArm3.setPos(0.0F, 4.0F, 2.0F);
		leftArm2.addChild(leftArm3);
		leftArm3.texOffs(50, 20).addBox(2.0F, 7.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-4.0F, -2.0F, 0.0F);
		

		rightArm2 = new ModelRenderer(this);
		rightArm2.setPos(0.0F, 0.0F, 0.0F);
		rightArm.addChild(rightArm2);
		setRotationAngle(rightArm2, 0.0F, 0.0F, 0.0873F);
		rightArm2.texOffs(42, 16).addBox(-4.0F, -2.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, true);

		rightArm3 = new ModelRenderer(this);
		rightArm3.setPos(-3.0F, 11.0F, 1.0F);
		rightArm2.addChild(rightArm3);
		rightArm3.texOffs(4, 2).addBox(1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -4.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(32, 0).addBox(-4.5F, -8.0F, -4.0F, 9.0F, 8.0F, 8.0F, 0.3F, false);

		brov = new ModelRenderer(this);
		brov.setPos(-0.5F, -5.0F, -4.51F);
		head.addChild(brov);
		setRotationAngle(brov, 0.0F, 0.0F, 0.3927F);
		brov.texOffs(24, 0).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, true);

		tongue = new ModelRenderer(this);
		tongue.setPos(0.0F, -1.0F, -4.0F);
		head.addChild(tongue);
		setRotationAngle(tongue, 0.6981F, 0.0F, 0.0F);
		tongue.texOffs(21, 32).addBox(-0.5F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 0.0F, false);

		tongue2 = new ModelRenderer(this);
		tongue2.setPos(0.0F, 0.0F, -1.0F);
		tongue.addChild(tongue2);
		setRotationAngle(tongue2, 1.0036F, 0.0F, 0.0F);
		tongue2.texOffs(19, 33).addBox(-0.5F, 0.0F, -3.0F, 1.0F, 0.0F, 3.0F, 0.0F, false);

		tongue3 = new ModelRenderer(this);
		tongue3.setPos(0.0F, 0.0F, -3.0F);
		tongue2.addChild(tongue3);
		setRotationAngle(tongue3, -0.5236F, 0.0F, 0.0F);
		tongue3.texOffs(20, 36).addBox(-0.5F, 0.0F, -2.0F, 1.0F, 0.0F, 2.0F, 0.0F, false);

		tongue4 = new ModelRenderer(this);
		tongue4.setPos(0.0F, 0.0F, -2.0F);
		tongue3.addChild(tongue4);
		setRotationAngle(tongue4, -0.5236F, 0.0F, 0.0F);
		tongue4.texOffs(18, 38).addBox(-0.5F, 0.0F, -4.0F, 1.0F, 0.0F, 4.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setPos(0.0F, -5.0F, 2.0F);
		head.addChild(head2);
		setRotationAngle(head2, 2.2689F, 0.0F, 0.0F);
		head2.texOffs(100, 0).addBox(-3.5F, -4.0F, -3.0F, 7.0F, 13.0F, 7.0F, 0.0F, false);

		head3 = new ModelRenderer(this);
		head3.setPos(0.0F, 3.0F, 0.0F);
		head2.addChild(head3);
		head3.texOffs(108, 20).addBox(-2.5F, 6.0F, -2.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		horn = new ModelRenderer(this);
		horn.setPos(3.5F, -5.0F, -2.0F);
		head.addChild(horn);
		setRotationAngle(horn, -0.4811F, 0.4492F, 0.554F);
		horn.texOffs(88, 0).addBox(-1.5F, -5.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		horn.texOffs(80, 3).addBox(0.5F, -4.0F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		horn2 = new ModelRenderer(this);
		horn2.setPos(0.0F, -4.0F, -0.5F);
		horn.addChild(horn2);
		setRotationAngle(horn2, 0.0F, 0.0F, -0.7854F);
		horn2.texOffs(89, 8).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, -0.1F, false);
		horn2.texOffs(81, 10).addBox(0.5F, -5.0F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		horn3 = new ModelRenderer(this);
		horn3.setPos(0.0F, -4.0F, 0.0F);
		horn2.addChild(horn3);
		setRotationAngle(horn3, 0.0F, 0.0F, 0.6109F);
		horn3.texOffs(90, 15).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, -0.2F, false);
		horn3.texOffs(84, 17).addBox(0.0F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		horn4 = new ModelRenderer(this);
		horn4.setPos(0.0F, -4.0F, 0.0F);
		horn3.addChild(horn4);
		setRotationAngle(horn4, 0.0F, 0.0F, 0.5236F);
		horn4.texOffs(90, 22).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, -0.3F, false);

		horn5 = new ModelRenderer(this);
		horn5.setPos(0.0F, -1.0F, -1.0F);
		horn4.addChild(horn5);
		horn5.texOffs(92, 27).addBox(-0.5F, -3.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		hornRight = new ModelRenderer(this);
		hornRight.setPos(-3.5F, -6.0F, -2.0F);
		head.addChild(hornRight);
		setRotationAngle(hornRight, -2.7012F, 0.4259F, 2.5703F);
		hornRight.texOffs(88, 0).addBox(-1.5F, -5.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.0F, true);
		hornRight.texOffs(80, 3).addBox(0.5F, -4.0F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		hornRight2 = new ModelRenderer(this);
		hornRight2.setPos(0.0F, -4.0F, -0.5F);
		hornRight.addChild(hornRight2);
		setRotationAngle(hornRight2, 0.0F, 0.0F, -0.7854F);
		hornRight2.texOffs(89, 8).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 5.0F, 2.0F, -0.1F, true);
		hornRight2.texOffs(81, 10).addBox(0.5F, -5.0F, 0.0F, 4.0F, 5.0F, 0.0F, 0.0F, false);

		hornRight3 = new ModelRenderer(this);
		hornRight3.setPos(0.0F, -4.0F, 0.0F);
		hornRight2.addChild(hornRight3);
		setRotationAngle(hornRight3, 0.0F, 0.0F, 0.6109F);
		hornRight3.texOffs(90, 15).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, -0.2F, true);
		hornRight3.texOffs(84, 17).addBox(0.0F, -5.0F, 0.0F, 3.0F, 5.0F, 0.0F, 0.0F, false);

		hornRight4 = new ModelRenderer(this);
		hornRight4.setPos(0.0F, -4.0F, 0.0F);
		hornRight3.addChild(hornRight4);
		setRotationAngle(hornRight4, 0.0F, 0.0F, 0.5236F);
		hornRight4.texOffs(90, 22).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, -0.3F, true);

		hornRight5 = new ModelRenderer(this);
		hornRight5.setPos(0.0F, -1.0F, -1.0F);
		hornRight4.addChild(hornRight5);
		hornRight5.texOffs(92, 27).addBox(-0.5F, -3.0F, 0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		brov2 = new ModelRenderer(this);
		brov2.setPos(0.5F, -5.0F, -4.51F);
		head.addChild(brov2);
		setRotationAngle(brov2, 0.0F, 0.0F, -0.3927F);
		brov2.texOffs(24, 0).addBox(0.0F, 0.0F, 0.0F, 3.0F, 1.0F, 0.0F, 0.0F, false);

		leftLeg = new ModelRenderer(this);
		leftLeg.setPos(0.0F, 7.0F, 0.0F);
		

		leftLeg1 = new ModelRenderer(this);
		leftLeg1.setPos(-0.1F, 0.0F, 0.0F);
		leftLeg.addChild(leftLeg1);
		setRotationAngle(leftLeg1, -0.3054F, 0.0F, 0.0F);
		leftLeg1.texOffs(0, 16).addBox(0.2F, 0.0F, -2.0F, 5.0F, 9.0F, 4.0F, 0.0F, false);

		leftLeg2 = new ModelRenderer(this);
		leftLeg2.setPos(0.0F, 7.0F, 0.0F);
		leftLeg1.addChild(leftLeg2);
		setRotationAngle(leftLeg2, 1.2217F, 0.0F, 0.0F);
		leftLeg2.texOffs(0, 29).addBox(0.7F, 0.0F, -2.0F, 4.0F, 6.0F, 3.0F, -0.1F, false);

		leftLeg3 = new ModelRenderer(this);
		leftLeg3.setPos(0.0F, 6.0F, 0.0F);
		leftLeg2.addChild(leftLeg3);
		setRotationAngle(leftLeg3, -0.9163F, 0.0F, 0.0F);
		leftLeg3.texOffs(0, 38).addBox(0.7F, 0.0F, -3.0F, 4.0F, 7.0F, 3.0F, 0.0F, false);

		leftLeg4 = new ModelRenderer(this);
		leftLeg4.setPos(1.2F, 5.6305F, -2.4914F);
		leftLeg3.addChild(leftLeg4);
		setRotationAngle(leftLeg4, 0.0436F, 0.0F, 0.0F);
		leftLeg4.texOffs(1, 48).addBox(-0.4F, -1.5F, -2.5F, 2.0F, 3.0F, 3.0F, -0.3F, false);

		rightLegClawBig2 = new ModelRenderer(this);
		rightLegClawBig2.setPos(2.0F, 0.0F, -2.0F);
		leftLeg4.addChild(rightLegClawBig2);
		rightLegClawBig2.texOffs(8, 55).addBox(-2.6F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, -0.3F, false);

		rightLegClawBig3 = new ModelRenderer(this);
		rightLegClawBig3.setPos(0.0F, 0.0F, -1.0F);
		rightLegClawBig2.addChild(rightLegClawBig3);
		rightLegClawBig3.texOffs(0, 61).addBox(-1.6F, 0.5F, -1.5F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		leftLeg5 = new ModelRenderer(this);
		leftLeg5.setPos(3.2F, 5.6305F, -2.4914F);
		leftLeg3.addChild(leftLeg5);
		

		rightLegClawBig4 = new ModelRenderer(this);
		rightLegClawBig4.setPos(2.0F, 0.0F, -1.0F);
		leftLeg5.addChild(rightLegClawBig4);
		rightLegClawBig4.texOffs(0, 55).addBox(-2.6F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.3F, false);

		rightLegClawBig5 = new ModelRenderer(this);
		rightLegClawBig5.setPos(0.0F, 0.0F, -2.0F);
		rightLegClawBig4.addChild(rightLegClawBig5);
		rightLegClawBig5.texOffs(0, 61).addBox(-2.1F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		leftLeg6 = new ModelRenderer(this);
		leftLeg6.setPos(5.2F, 5.5F, -1.5F);
		leftLeg3.addChild(leftLeg6);
		setRotationAngle(leftLeg6, 0.1309F, 0.0F, 0.0F);
		

		rightLegClawBig10 = new ModelRenderer(this);
		rightLegClawBig10.setPos(2.0F, 0.0F, -1.0F);
		leftLeg6.addChild(rightLegClawBig10);
		setRotationAngle(rightLegClawBig10, -0.1745F, 0.0F, 0.0F);
		rightLegClawBig10.texOffs(0, 55).addBox(-3.1F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.3F, false);

		rightLegClawBig11 = new ModelRenderer(this);
		rightLegClawBig11.setPos(0.0F, 0.0F, -2.0F);
		rightLegClawBig10.addChild(rightLegClawBig11);
		rightLegClawBig11.texOffs(0, 61).addBox(-2.6F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, -0.2F, false);

		rightLeg = new ModelRenderer(this);
		rightLeg.setPos(0.0F, 7.0F, 0.0F);
		

		rightLeg1 = new ModelRenderer(this);
		rightLeg1.setPos(-0.1F, 0.0F, 0.0F);
		rightLeg.addChild(rightLeg1);
		setRotationAngle(rightLeg1, -0.3054F, 0.0F, 0.0F);
		rightLeg1.texOffs(0, 16).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 9.0F, 4.0F, 0.0F, true);

		rightLeg2 = new ModelRenderer(this);
		rightLeg2.setPos(-4.0F, 7.0F, 0.0F);
		rightLeg1.addChild(rightLeg2);
		setRotationAngle(rightLeg2, 1.2217F, 0.0F, 0.0F);
		rightLeg2.texOffs(0, 29).addBox(-0.3F, 0.0F, -2.0F, 4.0F, 6.0F, 3.0F, -0.1F, true);

		rightLeg3 = new ModelRenderer(this);
		rightLeg3.setPos(0.0F, 6.0F, 0.0F);
		rightLeg2.addChild(rightLeg3);
		setRotationAngle(rightLeg3, -0.9163F, 0.0F, 0.0F);
		rightLeg3.texOffs(0, 38).addBox(-0.3F, 0.0F, -3.0F, 4.0F, 7.0F, 3.0F, 0.0F, true);

		rightLeg4 = new ModelRenderer(this);
		rightLeg4.setPos(2.2F, 5.6305F, -2.4914F);
		rightLeg3.addChild(rightLeg4);
		setRotationAngle(rightLeg4, 0.0436F, 0.0F, 0.0F);
		rightLeg4.texOffs(1, 48).addBox(-0.4F, -1.5F, -2.5F, 2.0F, 3.0F, 3.0F, -0.3F, true);

		rightLegClawBig6 = new ModelRenderer(this);
		rightLegClawBig6.setPos(3.0F, 0.0F, -2.0F);
		rightLeg4.addChild(rightLegClawBig6);
		rightLegClawBig6.texOffs(8, 55).addBox(-3.1F, -0.5F, -1.5F, 2.0F, 2.0F, 2.0F, -0.3F, true);

		rightLegClawBig7 = new ModelRenderer(this);
		rightLegClawBig7.setPos(-1.0F, 0.0F, -1.0F);
		rightLegClawBig6.addChild(rightLegClawBig7);
		rightLegClawBig7.texOffs(0, 61).addBox(-2.1F, 0.5F, -1.5F, 1.0F, 1.0F, 2.0F, -0.2F, true);

		rightLeg5 = new ModelRenderer(this);
		rightLeg5.setPos(3.2F, 5.6305F, -2.4914F);
		rightLeg3.addChild(rightLeg5);
		setRotationAngle(rightLeg5, 0.0436F, 0.0F, 0.0F);
		

		rightLegClawBig8 = new ModelRenderer(this);
		rightLegClawBig8.setPos(0.0F, 0.0F, -1.0F);
		rightLeg5.addChild(rightLegClawBig8);
		rightLegClawBig8.texOffs(0, 55).addBox(-3.1F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.3F, true);

		rightLegClawBig9 = new ModelRenderer(this);
		rightLegClawBig9.setPos(0.0F, 0.0F, -2.0F);
		rightLegClawBig8.addChild(rightLegClawBig9);
		rightLegClawBig9.texOffs(0, 61).addBox(-2.6F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, -0.2F, true);

		rightLeg6 = new ModelRenderer(this);
		rightLeg6.setPos(1.2F, 5.5F, -1.5F);
		rightLeg3.addChild(rightLeg6);
		setRotationAngle(rightLeg6, 0.0436F, 0.0F, 0.0F);
		

		rightLegClawBig12 = new ModelRenderer(this);
		rightLegClawBig12.setPos(0.0F, 0.0F, -1.0F);
		rightLeg6.addChild(rightLegClawBig12);
		rightLegClawBig12.texOffs(0, 55).addBox(-2.6F, -0.5F, -1.0F, 2.0F, 2.0F, 2.0F, -0.3F, true);

		rightLegClawBig13 = new ModelRenderer(this);
		rightLegClawBig13.setPos(0.0F, 0.0F, -2.0F);
		rightLegClawBig12.addChild(rightLegClawBig13);
		rightLegClawBig13.texOffs(0, 61).addBox(-2.1F, 0.5F, 0.0F, 1.0F, 1.0F, 2.0F, -0.2F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}